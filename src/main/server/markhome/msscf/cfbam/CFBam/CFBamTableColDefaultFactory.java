
// Description: Java 11 Default Factory implementation for TableCol.

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
	 *	CFBamTableColFactory implementation for TableCol
	 */
public class CFBamTableColDefaultFactory
	implements ICFBamTableColFactory
{
	public CFBamTableColDefaultFactory() {
	}

	public CFBamTableColByTableIdxKey newTableIdxKey() {
		CFBamTableColByTableIdxKey key =
			new CFBamTableColByTableIdxKey();
		return( key );
	}

	public CFBamTableColByDataIdxKey newDataIdxKey() {
		CFBamTableColByDataIdxKey key =
			new CFBamTableColByDataIdxKey();
		return( key );
	}

	public CFBamTableColBuff newBuff() {
		CFBamTableColBuff buff =
			new CFBamTableColBuff();
		return( buff );
	}

	public CFBamTableColHBuff newHBuff() {
		CFBamTableColHBuff hbuff =
			new CFBamTableColHBuff();
		return( hbuff );
	}
}
