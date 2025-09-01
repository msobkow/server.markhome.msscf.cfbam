
// Description: Java 11 Default Factory implementation for DateCol.

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
	 *	CFBamDateColFactory implementation for DateCol
	 */
public class CFBamDateColDefaultFactory
	implements ICFBamDateColFactory
{
	public CFBamDateColDefaultFactory() {
	}

	public CFBamDateColByTableIdxKey newTableIdxKey() {
		CFBamDateColByTableIdxKey key =
			new CFBamDateColByTableIdxKey();
		return( key );
	}

	public CFBamDateColBuff newBuff() {
		CFBamDateColBuff buff =
			new CFBamDateColBuff();
		return( buff );
	}

	public CFBamDateColHBuff newHBuff() {
		CFBamDateColHBuff hbuff =
			new CFBamDateColHBuff();
		return( hbuff );
	}
}
