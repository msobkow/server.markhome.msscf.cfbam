
// Description: Java 11 Factory interface for DelSubDep2.

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
 *	CFBamDelSubDep2Factory interface for DelSubDep2
 */
public interface ICFBamDelSubDep2Factory
{

	/**
	 *	Allocate a ContDelDep1Idx key over DelSubDep2 instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamDelSubDep2ByContDelDep1IdxKey newContDelDep1IdxKey();

	/**
	 *	Allocate a UNameIdx key over DelSubDep2 instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamDelSubDep2ByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a DelSubDep2 instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamDelSubDep2Buff newBuff();

	/**
	 *	Allocate a DelSubDep2 history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamDelSubDep2HBuff newHBuff();

}
