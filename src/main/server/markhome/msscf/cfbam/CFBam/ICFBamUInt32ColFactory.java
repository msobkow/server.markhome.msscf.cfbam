
// Description: Java 11 Factory interface for UInt32Col.

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
 *	CFBamUInt32ColFactory interface for UInt32Col
 */
public interface ICFBamUInt32ColFactory
{

	/**
	 *	Allocate a TableIdx key over UInt32Col instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamUInt32ColByTableIdxKey newTableIdxKey();

	/**
	 *	Allocate a UInt32Col instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamUInt32ColBuff newBuff();

	/**
	 *	Allocate a UInt32Col history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamUInt32ColHBuff newHBuff();

}
