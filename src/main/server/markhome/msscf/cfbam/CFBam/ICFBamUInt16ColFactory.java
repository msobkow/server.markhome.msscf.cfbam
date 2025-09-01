
// Description: Java 11 Factory interface for UInt16Col.

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
 *	CFBamUInt16ColFactory interface for UInt16Col
 */
public interface ICFBamUInt16ColFactory
{

	/**
	 *	Allocate a TableIdx key over UInt16Col instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamUInt16ColByTableIdxKey newTableIdxKey();

	/**
	 *	Allocate a UInt16Col instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamUInt16ColBuff newBuff();

	/**
	 *	Allocate a UInt16Col history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamUInt16ColHBuff newHBuff();

}
