
// Description: Java 11 Factory interface for DelSubDep3.

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
 *	CFBamDelSubDep3Factory interface for DelSubDep3
 */
public interface ICFBamDelSubDep3Factory
{

	/**
	 *	Allocate a DelSubDep2Idx key over DelSubDep3 instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamDelSubDep3ByDelSubDep2IdxKey newDelSubDep2IdxKey();

	/**
	 *	Allocate a UNameIdx key over DelSubDep3 instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamDelSubDep3ByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a DelSubDep3 instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamDelSubDep3Buff newBuff();

	/**
	 *	Allocate a DelSubDep3 history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamDelSubDep3HBuff newHBuff();

}
