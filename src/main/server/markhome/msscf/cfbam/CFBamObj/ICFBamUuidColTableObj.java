// Description: Java 11 Table Object interface for CFBam.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBam.*;

public interface ICFBamUuidColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new UuidCol instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamUuidColObj newInstance();

	/**
	 *	Instantiate a new UuidCol edition of the specified UuidCol instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamUuidColEditObj newEditInstance( ICFBamUuidColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamUuidColObj realiseUuidCol( ICFBamUuidColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamUuidColObj createUuidCol( ICFBamUuidColObj Obj );

	/**
	 *	Read a UuidCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamUuidColObj readUuidCol( CFBamValuePKey pkey );

	/**
	 *	Read a UuidCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamUuidColObj readUuidCol( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamUuidColObj readCachedUuidCol( CFBamValuePKey pkey );

	public void reallyDeepDisposeUuidCol( ICFBamUuidColObj obj );

	void deepDisposeUuidCol( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamUuidColObj lockUuidCol( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the UuidCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamUuidColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamUuidColObj> readAllUuidCol();

	/**
	 *	Return a sorted map of all the UuidCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamUuidColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamUuidColObj> readAllUuidCol( boolean forceRead );

	List<ICFBamUuidColObj> readCachedAllUuidCol();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamUuidColObj readUuidColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamUuidColObj readUuidColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamUuidColObj readUuidColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamUuidColObj readUuidColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamUuidColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamUuidColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamUuidColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamUuidColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamUuidColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamUuidColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamUuidColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamUuidColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamUuidColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	ICFBamUuidColObj readCachedUuidColByIdIdx( long TenantId,
		long Id );

	ICFBamUuidColObj readCachedUuidColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamUuidColObj> readCachedUuidColByValTentIdx( long TenantId );

	List<ICFBamUuidColObj> readCachedUuidColByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamUuidColObj> readCachedUuidColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamUuidColObj> readCachedUuidColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamUuidColObj> readCachedUuidColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamUuidColObj> readCachedUuidColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamUuidColObj> readCachedUuidColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamUuidColObj> readCachedUuidColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeUuidColByIdIdx( long TenantId,
		long Id );

	void deepDisposeUuidColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeUuidColByValTentIdx( long TenantId );

	void deepDisposeUuidColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeUuidColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeUuidColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeUuidColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeUuidColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeUuidColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeUuidColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamUuidColObj updateUuidCol( ICFBamUuidColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUuidCol( ICFBamUuidColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the CFBamUuidColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamUuidColObj refreshed cache instance.
	 */
	ICFBamUuidColObj moveUpUuidCol( ICFBamUuidColObj Obj );

	/**
	 *	Move the CFBamUuidColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamUuidColObj refreshed cache instance.
	 */
	ICFBamUuidColObj moveDownUuidCol( ICFBamUuidColObj Obj );
}
