
// Description: Java 11 Default Factory implementation for ServerObjFunc.

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
	 *	CFBamServerObjFuncFactory implementation for ServerObjFunc
	 */
public class CFBamServerObjFuncDefaultFactory
	implements ICFBamServerObjFuncFactory
{
	public CFBamServerObjFuncDefaultFactory() {
	}

	public CFBamServerObjFuncByRetTblIdxKey newRetTblIdxKey() {
		CFBamServerObjFuncByRetTblIdxKey key =
			new CFBamServerObjFuncByRetTblIdxKey();
		return( key );
	}

	public CFBamServerObjFuncBuff newBuff() {
		CFBamServerObjFuncBuff buff =
			new CFBamServerObjFuncBuff();
		return( buff );
	}

	public CFBamServerObjFuncHBuff newHBuff() {
		CFBamServerObjFuncHBuff hbuff =
			new CFBamServerObjFuncHBuff();
		return( hbuff );
	}
}
