#
# Copyright (c) 2008 Red Hat, Inc.
#
# This software is licensed to you under the GNU General Public License,
# version 2 (GPLv2). There is NO WARRANTY for this software, express or
# implied, including the implied warranties of MERCHANTABILITY or FITNESS
# FOR A PARTICULAR PURPOSE. You should have received a copy of GPLv2
# along with this software; if not, see
# http://www.gnu.org/licenses/old-licenses/gpl-2.0.txt.
#
# Red Hat trademarks are not licensed under GPLv2. No permission is
# granted to use or replicate Red Hat trademarks that are incorporated
# in this software or its documentation.
#

"""
Tests for the rhnSQL PostgreSQL driver.

To run you will have to modify the source and edit in your PostgreSQL host,
username, password, and database. The tests will attempt to create temporary
tables and clean them up afterward.
"""

import unittest

from server import rhnSQL
from random import randint

PG_HOST = "newman"
PG_USER = "spacewalk"
PG_PASSWORD = "spacewalk"
PG_DATABASE = "rhnsqltest"

rhnSQL.initDB(backend="postgresql", host=PG_HOST, username=PG_USER,
        password=PG_PASSWORD, database=PG_DATABASE)

class PgsqlTests(unittest.TestCase):

    def setUp(self):
        self.temp_table = "TestTable%s" % randint(1, 10000000)
        create_table_query = "CREATE TABLE %s(id INT, name TEXT)" % \
                self.temp_table
        cursor = rhnSQL.prepare(create_table_query)
        cursor.execute()

        #insert_query = "INSERT INTO %s(id, name) VALUES($1, $2)" % \
        #        self.temp_table
        #cursor = rhnSQL.prepare(insert_query)
        #ids = [1, 2, 3, 4, 5]
        #names = ["Bill", "Ted", "Mary", "Tom", "Susan"]
        #cursor.executemany([ids, names])

        insert_query = "INSERT INTO %s(id, name) VALUES($1, $2)" % \
                self.temp_table
        cursor = rhnSQL.prepare(insert_query)
        cursor.execute(1, "Bill")

    def tearDown(self):
        drop_table_query = "DROP TABLE %s" % self.temp_table
        cursor = rhnSQL.prepare(drop_table_query)
        cursor.execute()


    def test_fetchone(self):
        query = "SELECT * FROM %s WHERE id = 1" % self.temp_table
        cursor = rhnSQL.prepare(query)
        cursor.execute()
        results = cursor.fetchone()
        self.assertEquals(1, results[0])
        self.assertEquals("Bill", results[1])



def suite():
    suite = unittest.TestSuite()
    suite.addTest(unittest.makeSuite(PgsqlTests))
    return suite


if __name__ == "__main__":
    unittest.main(defaultTest="suite")
