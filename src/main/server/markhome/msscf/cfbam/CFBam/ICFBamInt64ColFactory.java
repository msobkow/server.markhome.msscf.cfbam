
// Description: Java 11 Factory interface for Int64Col.

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
 *	CFBamInt64ColFactory interface for Int64Col
 */
public interface ICFBamInt64ColFactory
{

	/**
	 *	Allocate a TableIdx key over Int64Col instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamInt64ColByTableIdxKey newTableIdxKey();

	/**
	 *	Allocate a Int64Col instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamInt64ColBuff newBuff();

	/**
	 *	Allocate a Int64Col history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamInt64ColHBuff newHBuff();

}
