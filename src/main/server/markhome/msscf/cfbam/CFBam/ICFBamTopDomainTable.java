
// Description: Java 11 DbIO interface for TopDomain.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBam;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBamObj.*;

/*
 *	CFBamTopDomainTable database interface for TopDomain
 */
public interface ICFBamTopDomainTable
extends ICFIntTopDomainTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createTopDomain( CFSecAuthorization Authorization,
		CFIntTopDomainBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateTopDomain( CFSecAuthorization Authorization,
		CFIntTopDomainBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteTopDomain( CFSecAuthorization Authorization,
		CFIntTopDomainBuff Buff );
	/**
	 *	Delete the TopDomain instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByIdIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the TopDomain instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteTopDomainByIdIdx( CFSecAuthorization Authorization,
		CFIntTopDomainPKey argKey );
	/**
	 *	Delete the TopDomain instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByTenantIdx( CFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the TopDomain instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTopDomainByTenantIdx( CFSecAuthorization Authorization,
		CFIntTopDomainByTenantIdxKey argKey );
	/**
	 *	Delete the TopDomain instances identified by the key TldIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	argTldId	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByTldIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argTldId );

	/**
	 *	Delete the TopDomain instances identified by the key TldIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTopDomainByTldIdx( CFSecAuthorization Authorization,
		CFIntTopDomainByTldIdxKey argKey );
	/**
	 *	Delete the TopDomain instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	argTldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByNameIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argTldId,
		String argName );

	/**
	 *	Delete the TopDomain instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTopDomainByNameIdx( CFSecAuthorization Authorization,
		CFIntTopDomainByNameIdxKey argKey );


	/**
	 *	Read the derived TopDomain buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TopDomain instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFIntTopDomainBuff readDerived( CFSecAuthorization Authorization,
		CFIntTopDomainPKey PKey );

	/**
	 *	Lock the derived TopDomain buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TopDomain instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFIntTopDomainBuff lockDerived( CFSecAuthorization Authorization,
		CFIntTopDomainPKey PKey );

	/**
	 *	Read all TopDomain instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	CFIntTopDomainBuff[] readAllDerived( CFSecAuthorization Authorization );

	/**
	 *	Read the derived TopDomain buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFIntTopDomainBuff readDerivedByIdIdx( CFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the derived TopDomain buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFIntTopDomainBuff[] readDerivedByTenantIdx( CFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived TopDomain buffer instances identified by the duplicate key TldIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	argTldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFIntTopDomainBuff[] readDerivedByTldIdx( CFSecAuthorization Authorization,
		long TenantId,
		long TldId );

	/**
	 *	Read the derived TopDomain buffer instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	argTldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFIntTopDomainBuff readDerivedByNameIdx( CFSecAuthorization Authorization,
		long TenantId,
		long TldId,
		String Name );

	/**
	 *	Read the specific TopDomain buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TopDomain instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFIntTopDomainBuff readBuff( CFSecAuthorization Authorization,
		CFIntTopDomainPKey PKey );

	/**
	 *	Lock the specific TopDomain buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TopDomain instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFIntTopDomainBuff lockBuff( CFSecAuthorization Authorization,
		CFIntTopDomainPKey PKey );

	/**
	 *	Read all the specific TopDomain buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific TopDomain instances in the database accessible for the Authorization.
	 */
	CFIntTopDomainBuff[] readAllBuff( CFSecAuthorization Authorization );

	/**
	 *	Read the specific TopDomain buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFIntTopDomainBuff readBuffByIdIdx( CFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the specific TopDomain buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFIntTopDomainBuff[] readBuffByTenantIdx( CFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific TopDomain buffer instances identified by the duplicate key TldIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	argTldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFIntTopDomainBuff[] readBuffByTldIdx( CFSecAuthorization Authorization,
		long TenantId,
		long TldId );

	/**
	 *	Read the specific TopDomain buffer instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	argTldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFIntTopDomainBuff readBuffByNameIdx( CFSecAuthorization Authorization,
		long TenantId,
		long TldId,
		String Name );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
