// Description: Java 11 Table Object interface for CFBam.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2020 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFBam 2.13 Business Application Model
 *	
 *	Copyright 2020 Mark Stephen Sobkow
 *	
 *		This file is part of MSS Code Factory.
 *	
 *		MSS Code Factory is available under dual commercial license from Mark Stephen
 *		Sobkow, or under the terms of the GNU General Public License, Version 3
 *		or later.
 *	
 *	    MSS Code Factory is free software: you can redistribute it and/or modify
 *	    it under the terms of the GNU General Public License as published by
 *	    the Free Software Foundation, either version 3 of the License, or
 *	    (at your option) any later version.
 *	
 *	    MSS Code Factory is distributed in the hope that it will be useful,
 *	    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	    GNU General Public License for more details.
 *	
 *	    You should have received a copy of the GNU General Public License
 *	    along with MSS Code Factory.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	Donations to support MSS Code Factory can be made at
 *	https://www.paypal.com/paypalme2/MarkSobkow
 *	
 *	Please contact Mark Stephen Sobkow at mark.sobkow@gmail.com for commercial licensing.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;

public interface ICFBamUuid6DefTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Uuid6Def instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamUuid6DefObj newInstance();

	/**
	 *	Instantiate a new Uuid6Def edition of the specified Uuid6Def instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamUuid6DefEditObj newEditInstance( ICFBamUuid6DefObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamUuid6DefObj realiseUuid6Def( ICFBamUuid6DefObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamUuid6DefObj createUuid6Def( ICFBamUuid6DefObj Obj );

	/**
	 *	Read a Uuid6Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Uuid6Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamUuid6DefObj readUuid6Def( CFBamValuePKey pkey );

	/**
	 *	Read a Uuid6Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Uuid6Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamUuid6DefObj readUuid6Def( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamUuid6DefObj readCachedUuid6Def( CFBamValuePKey pkey );

	public void reallyDeepDisposeUuid6Def( ICFBamUuid6DefObj obj );

	void deepDisposeUuid6Def( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamUuid6DefObj lockUuid6Def( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the Uuid6Def-derived instances in the database.
	 *
	 *	@return	List of ICFBamUuid6DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamUuid6DefObj> readAllUuid6Def();

	/**
	 *	Return a sorted map of all the Uuid6Def-derived instances in the database.
	 *
	 *	@return	List of ICFBamUuid6DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamUuid6DefObj> readAllUuid6Def( boolean forceRead );

	List<ICFBamUuid6DefObj> readCachedAllUuid6Def();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamUuid6DefObj readUuid6DefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamUuid6DefObj readUuid6DefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamUuid6DefObj readUuid6DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamUuid6DefObj readUuid6DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6DefObj> readUuid6DefByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamUuid6DefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6DefObj> readUuid6DefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6DefObj> readUuid6DefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamUuid6DefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6DefObj> readUuid6DefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6DefObj> readUuid6DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamUuid6DefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6DefObj> readUuid6DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6DefObj> readUuid6DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamUuid6DefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6DefObj> readUuid6DefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6DefObj> readUuid6DefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamUuid6DefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6DefObj> readUuid6DefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6DefObj> readUuid6DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamUuid6DefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6DefObj> readUuid6DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6DefObj> readUuid6DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamUuid6DefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6DefObj> readUuid6DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	ICFBamUuid6DefObj readCachedUuid6DefByIdIdx( long TenantId,
		long Id );

	ICFBamUuid6DefObj readCachedUuid6DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamUuid6DefObj> readCachedUuid6DefByValTentIdx( long TenantId );

	List<ICFBamUuid6DefObj> readCachedUuid6DefByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamUuid6DefObj> readCachedUuid6DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamUuid6DefObj> readCachedUuid6DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamUuid6DefObj> readCachedUuid6DefByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamUuid6DefObj> readCachedUuid6DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamUuid6DefObj> readCachedUuid6DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeUuid6DefByIdIdx( long TenantId,
		long Id );

	void deepDisposeUuid6DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeUuid6DefByValTentIdx( long TenantId );

	void deepDisposeUuid6DefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeUuid6DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeUuid6DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeUuid6DefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeUuid6DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeUuid6DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 */
	ICFBamUuid6DefObj updateUuid6Def( ICFBamUuid6DefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUuid6Def( ICFBamUuid6DefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Uuid6Def key attribute of the instance generating the id.
	 */
	void deleteUuid6DefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Uuid6Def key attribute of the instance generating the id.
	 */
	void deleteUuid6DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 */
	void deleteUuid6DefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 */
	void deleteUuid6DefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Uuid6Def key attribute of the instance generating the id.
	 */
	void deleteUuid6DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Def key attribute of the instance generating the id.
	 */
	void deleteUuid6DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Def key attribute of the instance generating the id.
	 */
	void deleteUuid6DefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Def key attribute of the instance generating the id.
	 */
	void deleteUuid6DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Def key attribute of the instance generating the id.
	 */
	void deleteUuid6DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Move the CFBamUuid6DefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamUuid6DefObj refreshed cache instance.
	 */
	ICFBamUuid6DefObj moveUpUuid6Def( ICFBamUuid6DefObj Obj );

	/**
	 *	Move the CFBamUuid6DefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamUuid6DefObj refreshed cache instance.
	 */
	ICFBamUuid6DefObj moveDownUuid6Def( ICFBamUuid6DefObj Obj );
}
