/**
 * Copyright (c) 2008 Red Hat, Inc.
 *
 * This software is licensed to you under the GNU General Public License,
 * version 2 (GPLv2). There is NO WARRANTY for this software, express or
 * implied, including the implied warranties of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. You should have received a copy of GPLv2
 * along with this software; if not, see
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.txt.
 * 
 * Red Hat trademarks are not licensed under GPLv2. No permission is
 * granted to use or replicate Red Hat trademarks that are incorporated
 * in this software or its documentation. 
 */
package com.redhat.rhn.frontend.dto;

import com.redhat.rhn.common.localization.LocalizationService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * PackageListItem
 * @version $Rev$
 */
public class PackageListItem extends IdComboDto {
    private String idCombo;
    private List elabIdCombo;
    private Long id;
    private String nvre;
    private List elabNvre;
    private String patchType;
    private String name;
    private String version;
    private String release;
    private String epoch;
    private String timestamp;
    private String actionStatus;
    private Long packageId;
    private Long nameId;
    private Long evrId;
    private String path;
    private String arch;
    private List channelName;
    private List channelId;
    private String evr;
    private String summary;
    private String nvrea;
    
    private Long idOne;
    private Long idTwo;
    private Long idThree;

    
    /**
     * @return Returns the arch.
     */
    public String getArch() {
        return arch;
    }
    /**
     * @param archIn The arch to set.
     */
    public void setArch(String archIn) {
        this.arch = archIn;
    }
    /**
     * @return Returns the channelId.
     */
    public List getChannelId() {
        return channelId;
    }
    /**
     * @param channelIdIn The channelId to set.
     */
    public void setChannelId(List channelIdIn) {
        this.channelId = channelIdIn;
    }
    /**
     * @return Returns the channelName.
     */
    public List getChannelName() {
        return channelName;
    }
    /**
     * @param channelNameIn The channelName to set.
     */
    public void setChannelName(List channelNameIn) {
        this.channelName = channelNameIn;
    }
    /**
     * @return Returns the path.
     */
    public String getPath() {
        return path;
    }
    /**
     * @param pathIn The path to set.
     */
    public void setPath(String pathIn) {
        this.path = pathIn;
    }
    /**
     * @return Returns the epoch.
     */
    public String getEpoch() {
        return epoch;
    }
    /**
     * @param epochIn The epoch to set.
     */
    public void setEpoch(String epochIn) {
        epoch = epochIn;
    }
    /**
     * 
     * @return Returns the packageId
     */
    public Long getPackageId() {
        return packageId;
    }
    /**
     * 
     * @param packageIdIn The packageId to set
     */
    public void setPackageId(Long packageIdIn) {
        packageId = packageIdIn;
    }
    
    /**
     * @return Returns the Id.
     */
    public Long getId() {
        return id;
    }
    /**
     * @param idIn The Id to set.
     */
    public void setId(Long idIn) {
        id = idIn;
    }
    /**
     * @return Returns the evrId.
     */
    public Long getEvrId() {
        return evrId;
    }
    /**
     * @param evrIdIn The evrId to set.
     */
    public void setEvrId(Long evrIdIn) {
        evrId = evrIdIn;
    }
    /**
     * @return Returns the idCombo.
     */
    public String getIdCombo() {
        return idCombo;
    }
    /**
     * {@inheritDoc}
     */
    public Long getIdOne() {
        return idOne;
        
    }
    /**
     * {@inheritDoc}
     */
    public Long getIdTwo() {
        return idTwo;
    }
    /**
     * {@inheritDoc}
     */
    public Long getIdThree() {
        return idThree;
    }
    /**
     * @param idComboIn The idCombo to set.
     */
    public void setIdCombo(String idComboIn) {
        idCombo = idComboIn;
        if (idComboIn != null) {
            String[] ids = idCombo.split("\\|");
            if (ids.length > 0) {
                idOne = Long.valueOf(ids[0]);
            }
            if (ids.length > 1) {
                idTwo = Long.valueOf(ids[1]);
            }
            if (ids.length > 2) {
                idThree = Long.valueOf(ids[2]);
            }
        }
    }
    /**
     * @return Returns the elab idCombo.
     */
    public List getElabIdCombo() {
        return elabIdCombo;
    }
    /**
     * @param elabIdComboIn The elabIdCombo to set.
     */
    public void setElabIdCombo(List elabIdComboIn) {
        elabIdCombo = elabIdComboIn;
    }
    /**
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }
    /**
     * @param nameIn The name to set.
     */
    public void setName(String nameIn) {
        name = nameIn;
    }
    /**
     * @return Returns the nameId.
     */
    public Long getNameId() {
        return nameId;
    }
    /**
     * @param nameIdIn The nameId to set.
     */
    public void setNameId(Long nameIdIn) {
        nameId = nameIdIn;
    }
    /**
     * @return Returns the nvre.
     */
    public String getNvre() {
        return nvre;
    }
    /**
     * @param nvreIn The nvre to set.
     */
    public void setNvre(String nvreIn) {
        nvre = nvreIn;
    }
    /**
     * @return Returns the elab nvre.
     */
    public List getElabNvre() {
        return elabNvre;
    }
    /**
     * @param elabNvreIn The elab nvre to set.
     */
    public void setElabNvre(List elabNvreIn) {
        elabNvre = elabNvreIn;
    }
    /**
     * @return Returns the release.
     */
    public String getRelease() {
        return release;
    }
    /**
     * @param releaseIn The release to set.
     */
    public void setRelease(String releaseIn) {
        release = releaseIn;
    }
    /**
     * @return Returns the version.
     */
    public String getVersion() {
        return version;
    }
    /**
     * @param versionIn The version to set.
     */
    public void setVersion(String versionIn) {
        version = versionIn;
    }
    /**
     * Returns the channel name and id instance variables as
     * a list of HashMaps all in a single convenient Object 
     * @return list of HashMaps with name and id keys
     */
    public List getChannels() {
        List retval = new ArrayList();
        for (int i = 0; i < channelId.size(); i++) {
            Map current = new HashMap();
            current.put("id", channelId.get(i));
            current.put("name", channelName.get(i));
            retval.add(current);
        }
        return retval;
    }
    /**
     * @return Returns the patch type.
     */
    public String getPatchType() {
        return patchType;
    }
    /**
     * @param patchTypeIn The version to set.
     */
    public void setPatchType(String patchTypeIn) {
        patchType = patchTypeIn;
    }
    /**
     * @return Returns the timestamp for patch installs.
     */
    public String getTimestamp() {
        if (timestamp == null) {
            timestamp = LocalizationService
                        .getInstance()
                        .getMessage("patches.installed.notavailable");            
        }
        
        return timestamp;
    }
    /**
     * @param timeStampIn The version to set.
     */
    public void setTimestamp(String timeStampIn) {
        timestamp = timeStampIn;
    }
    /**
     * @return Returns the timestamp for patch installs.
     */
    public String getActionStatus() {
        if (actionStatus == null) {
            actionStatus = "Not Available";
        }
        return actionStatus;
    }
    /**
     * @param actionStatusIn The status to set.
     */
    public void setActionStatus(String actionStatusIn) {
        actionStatus = actionStatusIn;
    }
    
    /**
     * @return Returns the evr.
     */
    public String getEvr() {
        return evr;
    }
    /**
     * @param evrIn The evr to set.
     */
    public void setEvr(String evrIn) {
        this.evr = evrIn;
    }
    /**
     * @return Returns the summary.
     */
    public String getSummary() {
        return summary;
    }
    /**
     * @param aSummary The summary to set.
     */
    public void setSummary(String aSummary) {
        this.summary = aSummary;
    }
    /**
     * @return Returns the nvrea.
     */
    public String getNvrea() {
        return nvrea;
    }
    /**
     * @param aNvrea The nvrea to set.
     */
    public void setNvrea(String aNvrea) {
        this.nvrea = aNvrea;
    }
    
    /**
     * Get a string representation of NEVR:
     * 
     * virt-manager-0.2.6-7.0.2.el5
     * 
     * @return String representation of package's NEVR
     */
    public String getNameEpochVersionRelease() {
        String e = (this.getEpoch() != null) ? this.getEpoch() : "0";
        String v = (this.getVersion() != null) ? this.getVersion() : "0";
        String r = (this.getRelease() != null) ? this.getRelease() : "0";
        return this.getName() + "-" + e + "-" + v + "-" + r;
    }
    

    /**
     * {@inheritDoc}
     */
    @Override
    public String getSelectionKey() {
        return getIdCombo() + "~*~" + getNvre(); 
    }
    /**
     * Returns a map of the keys used in this Package List . 
     * @return a map.
     */
    public Map <String, Long> getKeyMap() {
        Map <String, Long> ret = new HashMap<String, Long>();
        ret.put("name_id", getIdOne());
        ret.put("evr_id", getIdTwo());
        ret.put("arch_id", getIdThree());
        return ret;
    }
    
    /**
     * Returns a list of Key map representation for a given list of package  items 
     * @param items the list of package items to be converted. 
     * @return the list of key maps associated with the given items
     */
    public static  List<Map<String, Long>> toKeyMaps(List <PackageListItem> items) {
        List <Map<String, Long>> ret = new LinkedList<Map<String, Long>>();
        for (PackageListItem item : items) {
            ret.add(item.getKeyMap());
        }
        return ret;
    }    
    
    /**
     * Basically constructs a PackageListItem from a selection key.
     * @param key the seslect key string containing other metadata
     * @return the constructed PackageListItem.
     */
    public static PackageListItem parse(String key) {
        String [] row = key.split("\\~\\*\\~");
        PackageListItem item  = new PackageListItem();
        item.setIdCombo(row[0]);
        if (row.length > 1) {
            item.setNvre(row[1]);    
        }
        return item;
    }
}
