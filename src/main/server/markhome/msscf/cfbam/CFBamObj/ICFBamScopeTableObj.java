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

public interface ICFBamScopeTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Scope instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamScopeObj newInstance();

	/**
	 *	Instantiate a new Scope edition of the specified Scope instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamScopeEditObj newEditInstance( ICFBamScopeObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	argClassCode	The class code used to identify the proposed instance class.
	 *
	 *	@return	ICFBamScopeObj instance, which may be a subclass of a Scope instance.
	 */
	ICFBamScopeObj constructByClassCode( String argClassCode );

	/**
	 *	Internal use only.
	 */
	ICFBamScopeObj realiseScope( ICFBamScopeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamScopeObj createScope( ICFBamScopeObj Obj );

	/**
	 *	Read a Scope-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Scope-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamScopeObj readScope( CFBamScopePKey pkey );

	/**
	 *	Read a Scope-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Scope-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamScopeObj readScope( CFBamScopePKey pkey,
		boolean forceRead );

	ICFBamScopeObj readCachedScope( CFBamScopePKey pkey );

	public void reallyDeepDisposeScope( ICFBamScopeObj obj );

	void deepDisposeScope( CFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamScopeObj lockScope( CFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the Scope-derived instances in the database.
	 *
	 *	@return	List of ICFBamScopeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamScopeObj> readAllScope();

	/**
	 *	Return a sorted map of all the Scope-derived instances in the database.
	 *
	 *	@return	List of ICFBamScopeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamScopeObj> readAllScope( boolean forceRead );

	List<ICFBamScopeObj> readCachedAllScope();

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Scope key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Scope key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamScopeObj readScopeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Scope key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Scope key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamScopeObj readScopeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The Scope key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamScopeObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamScopeObj> readScopeByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The Scope key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamScopeObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamScopeObj> readScopeByTenantIdx( long TenantId,
		boolean forceRead );

	ICFBamScopeObj readCachedScopeByIdIdx( long TenantId,
		long Id );

	List<ICFBamScopeObj> readCachedScopeByTenantIdx( long TenantId );

	void deepDisposeScopeByIdIdx( long TenantId,
		long Id );

	void deepDisposeScopeByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 */
	ICFBamScopeObj updateScope( ICFBamScopeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteScope( ICFBamScopeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Scope key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Scope key attribute of the instance generating the id.
	 */
	void deleteScopeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Scope key attribute of the instance generating the id.
	 */
	void deleteScopeByTenantIdx( long TenantId );
}
