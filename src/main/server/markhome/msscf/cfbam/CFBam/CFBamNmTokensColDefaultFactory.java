
// Description: Java 11 Default Factory implementation for NmTokensCol.

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
	 *	CFBamNmTokensColFactory implementation for NmTokensCol
	 */
public class CFBamNmTokensColDefaultFactory
	implements ICFBamNmTokensColFactory
{
	public CFBamNmTokensColDefaultFactory() {
	}

	public CFBamNmTokensColByTableIdxKey newTableIdxKey() {
		CFBamNmTokensColByTableIdxKey key =
			new CFBamNmTokensColByTableIdxKey();
		return( key );
	}

	public CFBamNmTokensColBuff newBuff() {
		CFBamNmTokensColBuff buff =
			new CFBamNmTokensColBuff();
		return( buff );
	}

	public CFBamNmTokensColHBuff newHBuff() {
		CFBamNmTokensColHBuff hbuff =
			new CFBamNmTokensColHBuff();
		return( hbuff );
	}
}
