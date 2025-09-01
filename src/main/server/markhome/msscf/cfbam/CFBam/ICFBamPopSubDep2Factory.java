
// Description: Java 11 Factory interface for PopSubDep2.

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
 *	CFBamPopSubDep2Factory interface for PopSubDep2
 */
public interface ICFBamPopSubDep2Factory
{

	/**
	 *	Allocate a PopSubDep1Idx key over PopSubDep2 instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamPopSubDep2ByPopSubDep1IdxKey newPopSubDep1IdxKey();

	/**
	 *	Allocate a UNameIdx key over PopSubDep2 instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamPopSubDep2ByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a PopSubDep2 instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamPopSubDep2Buff newBuff();

	/**
	 *	Allocate a PopSubDep2 history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamPopSubDep2HBuff newHBuff();

}
