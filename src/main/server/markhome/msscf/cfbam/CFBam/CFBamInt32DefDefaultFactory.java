
// Description: Java 11 Default Factory implementation for Int32Def.

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
	 *	CFBamInt32DefFactory implementation for Int32Def
	 */
public class CFBamInt32DefDefaultFactory
	implements ICFBamInt32DefFactory
{
	public CFBamInt32DefDefaultFactory() {
	}

	public CFBamInt32DefBuff newBuff() {
		CFBamInt32DefBuff buff =
			new CFBamInt32DefBuff();
		return( buff );
	}

	public CFBamInt32DefHBuff newHBuff() {
		CFBamInt32DefHBuff hbuff =
			new CFBamInt32DefHBuff();
		return( hbuff );
	}
}
