
// Description: Java 11 Factory interface for PopDep.

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
 *	CFBamPopDepFactory interface for PopDep
 */
public interface ICFBamPopDepFactory
{

	/**
	 *	Allocate a RelationIdx key over PopDep instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamPopDepByRelationIdxKey newRelationIdxKey();

	/**
	 *	Allocate a DefSchemaIdx key over PopDep instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamPopDepByDefSchemaIdxKey newDefSchemaIdxKey();

	/**
	 *	Allocate a PopDep instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamPopDepBuff newBuff();

	/**
	 *	Allocate a PopDep history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamPopDepHBuff newHBuff();

}
