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

public interface ICFBamDbKeyHash160DefTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DbKeyHash160Def instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamDbKeyHash160DefObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash160Def edition of the specified DbKeyHash160Def instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamDbKeyHash160DefEditObj newEditInstance( ICFBamDbKeyHash160DefObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash160DefObj realiseDbKeyHash160Def( ICFBamDbKeyHash160DefObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash160DefObj createDbKeyHash160Def( ICFBamDbKeyHash160DefObj Obj );

	/**
	 *	Read a DbKeyHash160Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash160Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash160DefObj readDbKeyHash160Def( CFBamValuePKey pkey );

	/**
	 *	Read a DbKeyHash160Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash160Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash160DefObj readDbKeyHash160Def( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamDbKeyHash160DefObj readCachedDbKeyHash160Def( CFBamValuePKey pkey );

	public void reallyDeepDisposeDbKeyHash160Def( ICFBamDbKeyHash160DefObj obj );

	void deepDisposeDbKeyHash160Def( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash160DefObj lockDbKeyHash160Def( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash160Def-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash160DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash160DefObj> readAllDbKeyHash160Def();

	/**
	 *	Return a sorted map of all the DbKeyHash160Def-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash160DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash160DefObj> readAllDbKeyHash160Def( boolean forceRead );

	List<ICFBamDbKeyHash160DefObj> readCachedAllDbKeyHash160Def();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash160DefObj readDbKeyHash160DefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash160DefObj readDbKeyHash160DefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash160DefObj readDbKeyHash160DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash160DefObj readDbKeyHash160DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160DefObj> readDbKeyHash160DefByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamDbKeyHash160DefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160DefObj> readDbKeyHash160DefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160DefObj> readDbKeyHash160DefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamDbKeyHash160DefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160DefObj> readDbKeyHash160DefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160DefObj> readDbKeyHash160DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamDbKeyHash160DefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160DefObj> readDbKeyHash160DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160DefObj> readDbKeyHash160DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash160DefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160DefObj> readDbKeyHash160DefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160DefObj> readDbKeyHash160DefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash160DefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160DefObj> readDbKeyHash160DefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160DefObj> readDbKeyHash160DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash160DefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160DefObj> readDbKeyHash160DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160DefObj> readDbKeyHash160DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash160DefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160DefObj> readDbKeyHash160DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	ICFBamDbKeyHash160DefObj readCachedDbKeyHash160DefByIdIdx( long TenantId,
		long Id );

	ICFBamDbKeyHash160DefObj readCachedDbKeyHash160DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamDbKeyHash160DefObj> readCachedDbKeyHash160DefByValTentIdx( long TenantId );

	List<ICFBamDbKeyHash160DefObj> readCachedDbKeyHash160DefByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamDbKeyHash160DefObj> readCachedDbKeyHash160DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamDbKeyHash160DefObj> readCachedDbKeyHash160DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamDbKeyHash160DefObj> readCachedDbKeyHash160DefByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamDbKeyHash160DefObj> readCachedDbKeyHash160DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamDbKeyHash160DefObj> readCachedDbKeyHash160DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDbKeyHash160DefByIdIdx( long TenantId,
		long Id );

	void deepDisposeDbKeyHash160DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDbKeyHash160DefByValTentIdx( long TenantId );

	void deepDisposeDbKeyHash160DefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDbKeyHash160DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDbKeyHash160DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDbKeyHash160DefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDbKeyHash160DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDbKeyHash160DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash160DefObj updateDbKeyHash160Def( ICFBamDbKeyHash160DefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash160Def( ICFBamDbKeyHash160DefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash160Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160DefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash160Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160DefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160DefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash160Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160DefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Move the CFBamDbKeyHash160DefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash160DefObj refreshed cache instance.
	 */
	ICFBamDbKeyHash160DefObj moveUpDbKeyHash160Def( ICFBamDbKeyHash160DefObj Obj );

	/**
	 *	Move the CFBamDbKeyHash160DefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash160DefObj refreshed cache instance.
	 */
	ICFBamDbKeyHash160DefObj moveDownDbKeyHash160Def( ICFBamDbKeyHash160DefObj Obj );
}
