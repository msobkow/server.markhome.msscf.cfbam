
// Description: Java 11 Default Factory implementation for UInt64Def.

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
	 *	CFBamUInt64DefFactory implementation for UInt64Def
	 */
public class CFBamUInt64DefDefaultFactory
	implements ICFBamUInt64DefFactory
{
	public CFBamUInt64DefDefaultFactory() {
	}

	public CFBamUInt64DefBuff newBuff() {
		CFBamUInt64DefBuff buff =
			new CFBamUInt64DefBuff();
		return( buff );
	}

	public CFBamUInt64DefHBuff newHBuff() {
		CFBamUInt64DefHBuff hbuff =
			new CFBamUInt64DefHBuff();
		return( hbuff );
	}
}
