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

public interface ICFBamTZDateColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TZDateCol instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamTZDateColObj newInstance();

	/**
	 *	Instantiate a new TZDateCol edition of the specified TZDateCol instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamTZDateColEditObj newEditInstance( ICFBamTZDateColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamTZDateColObj realiseTZDateCol( ICFBamTZDateColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamTZDateColObj createTZDateCol( ICFBamTZDateColObj Obj );

	/**
	 *	Read a TZDateCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZDateCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTZDateColObj readTZDateCol( CFBamValuePKey pkey );

	/**
	 *	Read a TZDateCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZDateCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTZDateColObj readTZDateCol( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamTZDateColObj readCachedTZDateCol( CFBamValuePKey pkey );

	public void reallyDeepDisposeTZDateCol( ICFBamTZDateColObj obj );

	void deepDisposeTZDateCol( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamTZDateColObj lockTZDateCol( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TZDateCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamTZDateColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTZDateColObj> readAllTZDateCol();

	/**
	 *	Return a sorted map of all the TZDateCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamTZDateColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTZDateColObj> readAllTZDateCol( boolean forceRead );

	List<ICFBamTZDateColObj> readCachedAllTZDateCol();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZDateColObj readTZDateColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZDateColObj readTZDateColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZDateColObj readTZDateColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZDateColObj readTZDateColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamTZDateColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamTZDateColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamTZDateColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTZDateColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamTZDateColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTZDateColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamTZDateColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTZDateColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamTZDateColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	ICFBamTZDateColObj readCachedTZDateColByIdIdx( long TenantId,
		long Id );

	ICFBamTZDateColObj readCachedTZDateColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamTZDateColObj> readCachedTZDateColByValTentIdx( long TenantId );

	List<ICFBamTZDateColObj> readCachedTZDateColByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamTZDateColObj> readCachedTZDateColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamTZDateColObj> readCachedTZDateColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamTZDateColObj> readCachedTZDateColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamTZDateColObj> readCachedTZDateColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamTZDateColObj> readCachedTZDateColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamTZDateColObj> readCachedTZDateColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeTZDateColByIdIdx( long TenantId,
		long Id );

	void deepDisposeTZDateColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTZDateColByValTentIdx( long TenantId );

	void deepDisposeTZDateColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTZDateColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTZDateColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTZDateColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTZDateColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTZDateColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTZDateColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamTZDateColObj updateTZDateCol( ICFBamTZDateColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTZDateCol( ICFBamTZDateColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the CFBamTZDateColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTZDateColObj refreshed cache instance.
	 */
	ICFBamTZDateColObj moveUpTZDateCol( ICFBamTZDateColObj Obj );

	/**
	 *	Move the CFBamTZDateColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTZDateColObj refreshed cache instance.
	 */
	ICFBamTZDateColObj moveDownTZDateCol( ICFBamTZDateColObj Obj );
}
