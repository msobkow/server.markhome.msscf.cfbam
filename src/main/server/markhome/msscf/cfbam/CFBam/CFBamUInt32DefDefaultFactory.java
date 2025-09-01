
// Description: Java 11 Default Factory implementation for UInt32Def.

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
	 *	CFBamUInt32DefFactory implementation for UInt32Def
	 */
public class CFBamUInt32DefDefaultFactory
	implements ICFBamUInt32DefFactory
{
	public CFBamUInt32DefDefaultFactory() {
	}

	public CFBamUInt32DefBuff newBuff() {
		CFBamUInt32DefBuff buff =
			new CFBamUInt32DefBuff();
		return( buff );
	}

	public CFBamUInt32DefHBuff newHBuff() {
		CFBamUInt32DefHBuff hbuff =
			new CFBamUInt32DefHBuff();
		return( hbuff );
	}
}
