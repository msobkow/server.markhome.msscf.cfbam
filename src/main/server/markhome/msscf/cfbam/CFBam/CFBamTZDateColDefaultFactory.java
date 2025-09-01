
// Description: Java 11 Default Factory implementation for TZDateCol.

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
	 *	CFBamTZDateColFactory implementation for TZDateCol
	 */
public class CFBamTZDateColDefaultFactory
	implements ICFBamTZDateColFactory
{
	public CFBamTZDateColDefaultFactory() {
	}

	public CFBamTZDateColByTableIdxKey newTableIdxKey() {
		CFBamTZDateColByTableIdxKey key =
			new CFBamTZDateColByTableIdxKey();
		return( key );
	}

	public CFBamTZDateColBuff newBuff() {
		CFBamTZDateColBuff buff =
			new CFBamTZDateColBuff();
		return( buff );
	}

	public CFBamTZDateColHBuff newHBuff() {
		CFBamTZDateColHBuff hbuff =
			new CFBamTZDateColHBuff();
		return( hbuff );
	}
}
