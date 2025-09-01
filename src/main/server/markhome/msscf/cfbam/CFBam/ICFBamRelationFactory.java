
// Description: Java 11 Factory interface for Relation.

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

/*
 *	CFBamRelationFactory interface for Relation
 */
public interface ICFBamRelationFactory
{

	/**
	 *	Allocate a UNameIdx key over Relation instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamRelationByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a RelnTenantIdx key over Relation instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamRelationByRelnTenantIdxKey newRelnTenantIdxKey();

	/**
	 *	Allocate a RelTableIdx key over Relation instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamRelationByRelTableIdxKey newRelTableIdxKey();

	/**
	 *	Allocate a DefSchemaIdx key over Relation instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamRelationByDefSchemaIdxKey newDefSchemaIdxKey();

	/**
	 *	Allocate a FromKeyIdx key over Relation instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamRelationByFromKeyIdxKey newFromKeyIdxKey();

	/**
	 *	Allocate a ToTblIdx key over Relation instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamRelationByToTblIdxKey newToTblIdxKey();

	/**
	 *	Allocate a ToKeyIdx key over Relation instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamRelationByToKeyIdxKey newToKeyIdxKey();

	/**
	 *	Allocate a NarrowedIdx key over Relation instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamRelationByNarrowedIdxKey newNarrowedIdxKey();

	/**
	 *	Allocate a Relation instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamRelationBuff newBuff();

	/**
	 *	Allocate a Relation history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamRelationHBuff newHBuff();

}
