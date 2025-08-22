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

public interface ICFBamDbKeyHash224ColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DbKeyHash224Col instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamDbKeyHash224ColObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash224Col edition of the specified DbKeyHash224Col instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamDbKeyHash224ColEditObj newEditInstance( ICFBamDbKeyHash224ColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash224ColObj realiseDbKeyHash224Col( ICFBamDbKeyHash224ColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash224ColObj createDbKeyHash224Col( ICFBamDbKeyHash224ColObj Obj );

	/**
	 *	Read a DbKeyHash224Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash224Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash224ColObj readDbKeyHash224Col( CFBamValuePKey pkey );

	/**
	 *	Read a DbKeyHash224Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash224Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash224ColObj readDbKeyHash224Col( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamDbKeyHash224ColObj readCachedDbKeyHash224Col( CFBamValuePKey pkey );

	public void reallyDeepDisposeDbKeyHash224Col( ICFBamDbKeyHash224ColObj obj );

	void deepDisposeDbKeyHash224Col( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash224ColObj lockDbKeyHash224Col( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash224Col-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash224ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash224ColObj> readAllDbKeyHash224Col();

	/**
	 *	Return a sorted map of all the DbKeyHash224Col-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash224ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash224ColObj> readAllDbKeyHash224Col( boolean forceRead );

	List<ICFBamDbKeyHash224ColObj> readCachedAllDbKeyHash224Col();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash224ColObj readDbKeyHash224ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash224ColObj readDbKeyHash224ColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash224ColObj readDbKeyHash224ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash224ColObj readDbKeyHash224ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224ColObj> readDbKeyHash224ColByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamDbKeyHash224ColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224ColObj> readDbKeyHash224ColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224ColObj> readDbKeyHash224ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamDbKeyHash224ColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224ColObj> readDbKeyHash224ColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224ColObj> readDbKeyHash224ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamDbKeyHash224ColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224ColObj> readDbKeyHash224ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224ColObj> readDbKeyHash224ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash224ColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224ColObj> readDbKeyHash224ColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224ColObj> readDbKeyHash224ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash224ColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224ColObj> readDbKeyHash224ColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224ColObj> readDbKeyHash224ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash224ColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224ColObj> readDbKeyHash224ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224ColObj> readDbKeyHash224ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash224ColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224ColObj> readDbKeyHash224ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDbKeyHash224ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224ColObj> readDbKeyHash224ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamDbKeyHash224ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224ColObj> readDbKeyHash224ColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	ICFBamDbKeyHash224ColObj readCachedDbKeyHash224ColByIdIdx( long TenantId,
		long Id );

	ICFBamDbKeyHash224ColObj readCachedDbKeyHash224ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamDbKeyHash224ColObj> readCachedDbKeyHash224ColByValTentIdx( long TenantId );

	List<ICFBamDbKeyHash224ColObj> readCachedDbKeyHash224ColByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamDbKeyHash224ColObj> readCachedDbKeyHash224ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamDbKeyHash224ColObj> readCachedDbKeyHash224ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamDbKeyHash224ColObj> readCachedDbKeyHash224ColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamDbKeyHash224ColObj> readCachedDbKeyHash224ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamDbKeyHash224ColObj> readCachedDbKeyHash224ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamDbKeyHash224ColObj> readCachedDbKeyHash224ColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeDbKeyHash224ColByIdIdx( long TenantId,
		long Id );

	void deepDisposeDbKeyHash224ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDbKeyHash224ColByValTentIdx( long TenantId );

	void deepDisposeDbKeyHash224ColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDbKeyHash224ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDbKeyHash224ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDbKeyHash224ColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDbKeyHash224ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDbKeyHash224ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDbKeyHash224ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash224ColObj updateDbKeyHash224Col( ICFBamDbKeyHash224ColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash224Col( ICFBamDbKeyHash224ColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash224Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash224Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224ColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash224Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DbKeyHash224Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the CFBamDbKeyHash224ColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash224ColObj refreshed cache instance.
	 */
	ICFBamDbKeyHash224ColObj moveUpDbKeyHash224Col( ICFBamDbKeyHash224ColObj Obj );

	/**
	 *	Move the CFBamDbKeyHash224ColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash224ColObj refreshed cache instance.
	 */
	ICFBamDbKeyHash224ColObj moveDownDbKeyHash224Col( ICFBamDbKeyHash224ColObj Obj );
}
