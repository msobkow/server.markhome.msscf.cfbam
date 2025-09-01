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

public interface ICFBamIndexTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Index instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamIndexObj newInstance();

	/**
	 *	Instantiate a new Index edition of the specified Index instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamIndexEditObj newEditInstance( ICFBamIndexObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamIndexObj realiseIndex( ICFBamIndexObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamIndexObj createIndex( ICFBamIndexObj Obj );

	/**
	 *	Read a Index-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Index-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamIndexObj readIndex( CFBamScopePKey pkey );

	/**
	 *	Read a Index-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Index-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamIndexObj readIndex( CFBamScopePKey pkey,
		boolean forceRead );

	ICFBamIndexObj readCachedIndex( CFBamScopePKey pkey );

	public void reallyDeepDisposeIndex( ICFBamIndexObj obj );

	void deepDisposeIndex( CFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamIndexObj lockIndex( CFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the Index-derived instances in the database.
	 *
	 *	@return	List of ICFBamIndexObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamIndexObj> readAllIndex();

	/**
	 *	Return a sorted map of all the Index-derived instances in the database.
	 *
	 *	@return	List of ICFBamIndexObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamIndexObj> readAllIndex( boolean forceRead );

	List<ICFBamIndexObj> readCachedAllIndex();

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamIndexObj readIndexByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamIndexObj readIndexByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexObj> readIndexByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamIndexObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexObj> readIndexByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the CFBamIndexObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Index key attribute of the instance generating the id.
	 *
	 *	@return	CFBamIndexObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamIndexObj readIndexByUNameIdx(long TenantId,
		long TableId,
		String Name );

	/**
	 *	Get the CFBamIndexObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Index key attribute of the instance generating the id.
	 *
	 *	@return	CFBamIndexObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamIndexObj readIndexByUNameIdx(long TenantId,
		long TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamIndexObj instances sorted by their primary keys for the duplicate IndexTenantIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexObj cached instances sorted by their primary keys for the duplicate IndexTenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexObj> readIndexByIndexTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamIndexObj instances sorted by their primary keys for the duplicate IndexTenantIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexObj cached instances sorted by their primary keys for the duplicate IndexTenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexObj> readIndexByIndexTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamIndexObj instances sorted by their primary keys for the duplicate IdxTableIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexObj cached instances sorted by their primary keys for the duplicate IdxTableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexObj> readIndexByIdxTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamIndexObj instances sorted by their primary keys for the duplicate IdxTableIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexObj cached instances sorted by their primary keys for the duplicate IdxTableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexObj> readIndexByIdxTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamIndexObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexObj> readIndexByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamIndexObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexObj> readIndexByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	ICFBamIndexObj readCachedIndexByIdIdx( long TenantId,
		long Id );

	List<ICFBamIndexObj> readCachedIndexByTenantIdx( long TenantId );

	ICFBamIndexObj readCachedIndexByUNameIdx( long TenantId,
		long TableId,
		String Name );

	List<ICFBamIndexObj> readCachedIndexByIndexTenantIdx( long TenantId );

	List<ICFBamIndexObj> readCachedIndexByIdxTableIdx( long TenantId,
		long TableId );

	List<ICFBamIndexObj> readCachedIndexByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeIndexByIdIdx( long TenantId,
		long Id );

	void deepDisposeIndexByTenantIdx( long TenantId );

	void deepDisposeIndexByUNameIdx( long TenantId,
		long TableId,
		String Name );

	void deepDisposeIndexByIndexTenantIdx( long TenantId );

	void deepDisposeIndexByIdxTableIdx( long TenantId,
		long TableId );

	void deepDisposeIndexByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 */
	ICFBamIndexObj updateIndex( ICFBamIndexObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteIndex( ICFBamIndexObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByUNameIdx(long TenantId,
		long TableId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByIndexTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByIdxTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );
}
