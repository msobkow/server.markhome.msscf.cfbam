
// Description: Java 11 Factory interface for Id64Gen.

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
 *	CFBamId64GenFactory interface for Id64Gen
 */
public interface ICFBamId64GenFactory
{

	/**
	 *	Allocate a DispIdx key over Id64Gen instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamId64GenByDispIdxKey newDispIdxKey();

	/**
	 *	Allocate a Id64Gen instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamId64GenBuff newBuff();

	/**
	 *	Allocate a Id64Gen history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamId64GenHBuff newHBuff();

}
