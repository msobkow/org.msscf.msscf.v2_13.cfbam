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

public interface ICFBamDbKeyHash384DefTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DbKeyHash384Def instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamDbKeyHash384DefObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash384Def edition of the specified DbKeyHash384Def instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamDbKeyHash384DefEditObj newEditInstance( ICFBamDbKeyHash384DefObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash384DefObj realiseDbKeyHash384Def( ICFBamDbKeyHash384DefObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash384DefObj createDbKeyHash384Def( ICFBamDbKeyHash384DefObj Obj );

	/**
	 *	Read a DbKeyHash384Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash384Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash384DefObj readDbKeyHash384Def( CFBamValuePKey pkey );

	/**
	 *	Read a DbKeyHash384Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash384Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash384DefObj readDbKeyHash384Def( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamDbKeyHash384DefObj readCachedDbKeyHash384Def( CFBamValuePKey pkey );

	public void reallyDeepDisposeDbKeyHash384Def( ICFBamDbKeyHash384DefObj obj );

	void deepDisposeDbKeyHash384Def( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash384DefObj lockDbKeyHash384Def( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash384Def-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash384DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash384DefObj> readAllDbKeyHash384Def();

	/**
	 *	Return a sorted map of all the DbKeyHash384Def-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash384DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash384DefObj> readAllDbKeyHash384Def( boolean forceRead );

	List<ICFBamDbKeyHash384DefObj> readCachedAllDbKeyHash384Def();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash384DefObj readDbKeyHash384DefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash384DefObj readDbKeyHash384DefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash384DefObj readDbKeyHash384DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash384DefObj readDbKeyHash384DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384DefObj> readDbKeyHash384DefByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamDbKeyHash384DefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384DefObj> readDbKeyHash384DefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384DefObj> readDbKeyHash384DefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamDbKeyHash384DefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384DefObj> readDbKeyHash384DefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384DefObj> readDbKeyHash384DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamDbKeyHash384DefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384DefObj> readDbKeyHash384DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384DefObj> readDbKeyHash384DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash384DefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384DefObj> readDbKeyHash384DefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384DefObj> readDbKeyHash384DefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash384DefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384DefObj> readDbKeyHash384DefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384DefObj> readDbKeyHash384DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash384DefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384DefObj> readDbKeyHash384DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384DefObj> readDbKeyHash384DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash384DefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384DefObj> readDbKeyHash384DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	ICFBamDbKeyHash384DefObj readCachedDbKeyHash384DefByIdIdx( long TenantId,
		long Id );

	ICFBamDbKeyHash384DefObj readCachedDbKeyHash384DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamDbKeyHash384DefObj> readCachedDbKeyHash384DefByValTentIdx( long TenantId );

	List<ICFBamDbKeyHash384DefObj> readCachedDbKeyHash384DefByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamDbKeyHash384DefObj> readCachedDbKeyHash384DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamDbKeyHash384DefObj> readCachedDbKeyHash384DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamDbKeyHash384DefObj> readCachedDbKeyHash384DefByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamDbKeyHash384DefObj> readCachedDbKeyHash384DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamDbKeyHash384DefObj> readCachedDbKeyHash384DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDbKeyHash384DefByIdIdx( long TenantId,
		long Id );

	void deepDisposeDbKeyHash384DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDbKeyHash384DefByValTentIdx( long TenantId );

	void deepDisposeDbKeyHash384DefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDbKeyHash384DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDbKeyHash384DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDbKeyHash384DefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDbKeyHash384DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDbKeyHash384DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash384DefObj updateDbKeyHash384Def( ICFBamDbKeyHash384DefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash384Def( ICFBamDbKeyHash384DefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash384Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384DefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash384Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384DefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384DefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash384Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash384Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash384Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384DefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash384Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash384Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Move the CFBamDbKeyHash384DefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash384DefObj refreshed cache instance.
	 */
	ICFBamDbKeyHash384DefObj moveUpDbKeyHash384Def( ICFBamDbKeyHash384DefObj Obj );

	/**
	 *	Move the CFBamDbKeyHash384DefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash384DefObj refreshed cache instance.
	 */
	ICFBamDbKeyHash384DefObj moveDownDbKeyHash384Def( ICFBamDbKeyHash384DefObj Obj );
}
