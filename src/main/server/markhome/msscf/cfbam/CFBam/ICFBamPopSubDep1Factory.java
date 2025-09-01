
// Description: Java 11 Factory interface for PopSubDep1.

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
 *	CFBamPopSubDep1Factory interface for PopSubDep1
 */
public interface ICFBamPopSubDep1Factory
{

	/**
	 *	Allocate a PopTopDepIdx key over PopSubDep1 instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamPopSubDep1ByPopTopDepIdxKey newPopTopDepIdxKey();

	/**
	 *	Allocate a UNameIdx key over PopSubDep1 instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamPopSubDep1ByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a PopSubDep1 instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamPopSubDep1Buff newBuff();

	/**
	 *	Allocate a PopSubDep1 history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamPopSubDep1HBuff newHBuff();

}
