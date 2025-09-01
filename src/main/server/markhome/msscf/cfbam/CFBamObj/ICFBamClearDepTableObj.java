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

public interface ICFBamClearDepTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new ClearDep instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamClearDepObj newInstance();

	/**
	 *	Instantiate a new ClearDep edition of the specified ClearDep instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamClearDepEditObj newEditInstance( ICFBamClearDepObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamClearDepObj realiseClearDep( ICFBamClearDepObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamClearDepObj createClearDep( ICFBamClearDepObj Obj );

	/**
	 *	Read a ClearDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamClearDepObj readClearDep( CFBamScopePKey pkey );

	/**
	 *	Read a ClearDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamClearDepObj readClearDep( CFBamScopePKey pkey,
		boolean forceRead );

	ICFBamClearDepObj readCachedClearDep( CFBamScopePKey pkey );

	public void reallyDeepDisposeClearDep( ICFBamClearDepObj obj );

	void deepDisposeClearDep( CFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamClearDepObj lockClearDep( CFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the ClearDep-derived instances in the database.
	 *
	 *	@return	List of ICFBamClearDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamClearDepObj> readAllClearDep();

	/**
	 *	Return a sorted map of all the ClearDep-derived instances in the database.
	 *
	 *	@return	List of ICFBamClearDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamClearDepObj> readAllClearDep( boolean forceRead );

	List<ICFBamClearDepObj> readCachedAllClearDep();

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamClearDepObj readClearDepByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamClearDepObj readClearDepByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearDepObj> readClearDepByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamClearDepObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearDepObj> readClearDepByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamClearDepObj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	argTenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearDepObj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearDepObj> readClearDepByClearDepIdx( long TenantId,
		long RelationId );

	/**
	 *	Get the map of CFBamClearDepObj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	argTenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearDepObj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearDepObj> readClearDepByClearDepIdx( long TenantId,
		long RelationId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamClearDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearDepObj> readClearDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamClearDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearDepObj> readClearDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	ICFBamClearDepObj readCachedClearDepByIdIdx( long TenantId,
		long Id );

	List<ICFBamClearDepObj> readCachedClearDepByTenantIdx( long TenantId );

	List<ICFBamClearDepObj> readCachedClearDepByClearDepIdx( long TenantId,
		long RelationId );

	List<ICFBamClearDepObj> readCachedClearDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeClearDepByIdIdx( long TenantId,
		long Id );

	void deepDisposeClearDepByTenantIdx( long TenantId );

	void deepDisposeClearDepByClearDepIdx( long TenantId,
		long RelationId );

	void deepDisposeClearDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 */
	ICFBamClearDepObj updateClearDep( ICFBamClearDepObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteClearDep( ICFBamClearDepObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ClearDep key attribute of the instance generating the id.
	 */
	void deleteClearDepByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ClearDep key attribute of the instance generating the id.
	 */
	void deleteClearDepByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearDep key attribute of the instance generating the id.
	 */
	void deleteClearDepByClearDepIdx( long TenantId,
		long RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearDep key attribute of the instance generating the id.
	 */
	void deleteClearDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );
}
