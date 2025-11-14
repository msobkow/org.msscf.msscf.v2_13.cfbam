// Description: Java 11 Object interface for CFBam SecGrpMemb.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2025 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFSec 2.13 Security Essentials
 *	
 *	Copyright (C) 2016-2025 Mark Stephen Sobkow (mailto:mark.sobkow@gmail.com)
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;

public interface ICFBamSecGrpMembObj
	extends ICFSecSecGrpMembObj,
		ICFIntSecGrpMembObj
{
	String getClassCode();
	/**
	 *	Get the user who created this instance.
	 *
	 *	@return	The ICFSecSecUserObj instance who created this instance.
	 */
	ICFSecSecUserObj getCreatedBy();

	/**
	 *	Get the Calendar date-time this instance was created.
	 *
	 *	@return	The Calendar value for the create time of the instance.
	 */
	Calendar getCreatedAt();

	/**
	 *	Get the user who updated this instance.
	 *
	 *	@return	The ICFSecSecUserObj instance who updated this instance.
	 */
	ICFSecSecUserObj getUpdatedBy();

	/**
	 *	Get the Calendar date-time this instance was updated.
	 *
	 *	@return	The Calendar value for the create time of the instance.
	 */
	Calendar getUpdatedAt();
	/**
	 *	Realise this instance of a SecGrpMemb.
	 *
	 *	@return	CFSecSecGrpMembObj instance which should be subsequently referenced.
	 */
	ICFSecSecGrpMembObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecSecGrpMembObj the reference to the cached or read (realised) instance.
	 */
	ICFSecSecGrpMembObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecSecGrpMembObj the reference to the cached or read (realised) instance.
	 */
	ICFSecSecGrpMembObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SecGrpMemb instance.
	 *
	 *	@return	The newly locked ICFSecSecGrpMembEditObj edition of this instance.
	 */
	ICFSecSecGrpMembEditObj beginEdit();

	/**
	 *	End this edition of this SecGrpMemb instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SecGrpMemb instance.
	 *
	 *	@return	The ICFSecSecGrpMembEditObj edition of this instance.
	 */
	ICFSecSecGrpMembEditObj getEdit();

	/**
	 *	Get the current edition of this SecGrpMemb instance as a ICFSecSecGrpMembEditObj.
	 *
	 *	@return	The ICFSecSecGrpMembEditObj edition of this instance.
	 */
	ICFSecSecGrpMembEditObj getEditAsSecGrpMemb();

	/**
	 *	Get the ICFSecSecGrpMembTableObj table cache which manages this instance.
	 *
	 *	@return	ICFSecSecGrpMembTableObj table cache which manages this instance.
	 */
	ICFSecSecGrpMembTableObj getSecGrpMembTable();

	/**
	 *	Get the ICFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFSecSchemaObj schema cache which manages this instance.
	 */
	ICFSecSchemaObj getSchema();

	/**
	 *	Get the CFSecSecGrpMembBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecSecGrpMembBuff instance which currently backs this object.
	 */
	CFSecSecGrpMembBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFSecSecGrpMembBuff value );

	/**
	 *	Get the CFSecSecGrpMembBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecSecGrpMembBuff instance which currently backs this object.
	 */
	CFSecSecGrpMembBuff getSecGrpMembBuff();

	/**
	 *	Is this a new instance?
	 *
	 *	@return	True if this is a new instance, otherwise false if it has
	 *		been read, locked, or created.
	 */
	boolean getIsNew();

	/**
	 *	Indicate whether this is a new instance.
	 *	<p>
	 *	This method should only be used by implementation internals.
	 *
	 *	@param	True if this is a new instance, otherwise false.
	 */
	void setIsNew( boolean value );

	/**
	 *	Get the required long attribute ClusterId.
	 *
	 *	@return	The required long attribute ClusterId.
	 */
	long getRequiredClusterId();

	/**
	 *	Get the required long attribute SecGrpMembId.
	 *
	 *	@return	The required long attribute SecGrpMembId.
	 */
	long getRequiredSecGrpMembId();

	/**
	 *	Get the required int attribute SecGroupId.
	 *
	 *	@return	The required int attribute SecGroupId.
	 */
	int getRequiredSecGroupId();

	/**
	 *	Get the required UUID attribute SecUserId.
	 *
	 *	@return	The required UUID attribute SecUserId.
	 */
	UUID getRequiredSecUserId();

	/**
	 *	Get the required ICFBamClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required ICFBamClusterObj instance referenced by the Cluster key.
	 */
	ICFSecClusterObj getRequiredOwnerCluster();

	/**
	 *	Get the required ICFSecClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required ICFSecClusterObj instance referenced by the Cluster key.
	 */
	ICFSecClusterObj getRequiredOwnerCluster( boolean forceRead );

	/**
	 *	Get the required ICFBamSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The required ICFBamSecGroupObj instance referenced by the Group key.
	 */
	ICFSecSecGroupObj getRequiredContainerGroup();

	/**
	 *	Get the required ICFSecSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The required ICFSecSecGroupObj instance referenced by the Group key.
	 */
	ICFSecSecGroupObj getRequiredContainerGroup( boolean forceRead );

	/**
	 *	Get the required ICFBamSecUserObj instance referenced by the User key.
	 *
	 *	@return	The required ICFBamSecUserObj instance referenced by the User key.
	 */
	ICFSecSecUserObj getRequiredParentUser();

	/**
	 *	Get the required ICFSecSecUserObj instance referenced by the User key.
	 *
	 *	@return	The required ICFSecSecUserObj instance referenced by the User key.
	 */
	ICFSecSecUserObj getRequiredParentUser( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
