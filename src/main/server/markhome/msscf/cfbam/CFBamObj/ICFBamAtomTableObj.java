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

public interface ICFBamAtomTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Atom instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamAtomObj newInstance();

	/**
	 *	Instantiate a new Atom edition of the specified Atom instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamAtomEditObj newEditInstance( ICFBamAtomObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamAtomObj realiseAtom( ICFBamAtomObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamAtomObj createAtom( ICFBamAtomObj Obj );

	/**
	 *	Read a Atom-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Atom-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamAtomObj readAtom( CFBamValuePKey pkey );

	/**
	 *	Read a Atom-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Atom-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamAtomObj readAtom( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamAtomObj readCachedAtom( CFBamValuePKey pkey );

	public void reallyDeepDisposeAtom( ICFBamAtomObj obj );

	void deepDisposeAtom( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamAtomObj lockAtom( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the Atom-derived instances in the database.
	 *
	 *	@return	List of ICFBamAtomObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamAtomObj> readAllAtom();

	/**
	 *	Return a sorted map of all the Atom-derived instances in the database.
	 *
	 *	@return	List of ICFBamAtomObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamAtomObj> readAllAtom( boolean forceRead );

	List<ICFBamAtomObj> readCachedAllAtom();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Atom key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamAtomObj readAtomByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Atom key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamAtomObj readAtomByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Atom key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamAtomObj readAtomByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Atom key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamAtomObj readAtomByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamAtomObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamAtomObj> readAtomByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamAtomObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamAtomObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamAtomObj> readAtomByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Atom key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamAtomObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamAtomObj> readAtomByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamAtomObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Atom key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamAtomObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamAtomObj> readAtomByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Atom key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamAtomObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamAtomObj> readAtomByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamAtomObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Atom key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamAtomObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamAtomObj> readAtomByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Atom key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamAtomObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamAtomObj> readAtomByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamAtomObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Atom key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamAtomObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamAtomObj> readAtomByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Atom key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamAtomObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamAtomObj> readAtomByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamAtomObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Atom key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamAtomObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamAtomObj> readAtomByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Atom key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamAtomObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamAtomObj> readAtomByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamAtomObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Atom key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamAtomObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamAtomObj> readAtomByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Atom key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamAtomObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamAtomObj> readAtomByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamAtomObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Atom key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamAtomObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamAtomObj> readAtomByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	ICFBamAtomObj readCachedAtomByIdIdx( long TenantId,
		long Id );

	ICFBamAtomObj readCachedAtomByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamAtomObj> readCachedAtomByValTentIdx( long TenantId );

	List<ICFBamAtomObj> readCachedAtomByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamAtomObj> readCachedAtomByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamAtomObj> readCachedAtomByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamAtomObj> readCachedAtomByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamAtomObj> readCachedAtomByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamAtomObj> readCachedAtomByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeAtomByIdIdx( long TenantId,
		long Id );

	void deepDisposeAtomByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeAtomByValTentIdx( long TenantId );

	void deepDisposeAtomByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeAtomByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeAtomByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeAtomByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeAtomByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeAtomByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 */
	ICFBamAtomObj updateAtom( ICFBamAtomObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteAtom( ICFBamAtomObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Atom key attribute of the instance generating the id.
	 */
	void deleteAtomByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Atom key attribute of the instance generating the id.
	 */
	void deleteAtomByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Atom key attribute of the instance generating the id.
	 */
	void deleteAtomByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Atom key attribute of the instance generating the id.
	 */
	void deleteAtomByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Atom key attribute of the instance generating the id.
	 */
	void deleteAtomByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Atom key attribute of the instance generating the id.
	 */
	void deleteAtomByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Atom key attribute of the instance generating the id.
	 */
	void deleteAtomByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Atom key attribute of the instance generating the id.
	 */
	void deleteAtomByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Atom key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Atom key attribute of the instance generating the id.
	 */
	void deleteAtomByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Move the CFBamAtomObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamAtomObj refreshed cache instance.
	 */
	ICFBamAtomObj moveUpAtom( ICFBamAtomObj Obj );

	/**
	 *	Move the CFBamAtomObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamAtomObj refreshed cache instance.
	 */
	ICFBamAtomObj moveDownAtom( ICFBamAtomObj Obj );
}
