
// Description: Java 11 Default Factory implementation for TZTimeCol.

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
	 *	CFBamTZTimeColFactory implementation for TZTimeCol
	 */
public class CFBamTZTimeColDefaultFactory
	implements ICFBamTZTimeColFactory
{
	public CFBamTZTimeColDefaultFactory() {
	}

	public CFBamTZTimeColByTableIdxKey newTableIdxKey() {
		CFBamTZTimeColByTableIdxKey key =
			new CFBamTZTimeColByTableIdxKey();
		return( key );
	}

	public CFBamTZTimeColBuff newBuff() {
		CFBamTZTimeColBuff buff =
			new CFBamTZTimeColBuff();
		return( buff );
	}

	public CFBamTZTimeColHBuff newHBuff() {
		CFBamTZTimeColHBuff hbuff =
			new CFBamTZTimeColHBuff();
		return( hbuff );
	}
}
