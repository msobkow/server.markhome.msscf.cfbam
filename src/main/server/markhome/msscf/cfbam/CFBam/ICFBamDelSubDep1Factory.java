
// Description: Java 11 Factory interface for DelSubDep1.

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
 *	CFBamDelSubDep1Factory interface for DelSubDep1
 */
public interface ICFBamDelSubDep1Factory
{

	/**
	 *	Allocate a DelTopDepIdx key over DelSubDep1 instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamDelSubDep1ByDelTopDepIdxKey newDelTopDepIdxKey();

	/**
	 *	Allocate a UNameIdx key over DelSubDep1 instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamDelSubDep1ByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a DelSubDep1 instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamDelSubDep1Buff newBuff();

	/**
	 *	Allocate a DelSubDep1 history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamDelSubDep1HBuff newHBuff();

}
