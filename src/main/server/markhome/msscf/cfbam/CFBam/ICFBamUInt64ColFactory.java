
// Description: Java 11 Factory interface for UInt64Col.

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
 *	CFBamUInt64ColFactory interface for UInt64Col
 */
public interface ICFBamUInt64ColFactory
{

	/**
	 *	Allocate a TableIdx key over UInt64Col instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamUInt64ColByTableIdxKey newTableIdxKey();

	/**
	 *	Allocate a UInt64Col instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamUInt64ColBuff newBuff();

	/**
	 *	Allocate a UInt64Col history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamUInt64ColHBuff newHBuff();

}
