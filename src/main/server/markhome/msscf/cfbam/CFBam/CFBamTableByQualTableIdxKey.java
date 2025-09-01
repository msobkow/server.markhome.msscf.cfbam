// Description: Java 11 implementation of a Table by QualTableIdx index key object.

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
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;

public class CFBamTableByQualTableIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Long optionalQualifyingTenantId;
	protected Long optionalQualifyingTableId;
	public CFBamTableByQualTableIdxKey() {
		optionalQualifyingTenantId = null;
		optionalQualifyingTableId = null;
	}

	public Long getOptionalQualifyingTenantId() {
		return( optionalQualifyingTenantId );
	}

	public void setOptionalQualifyingTenantId( Long value ) {
		if( value == null ) {
			optionalQualifyingTenantId = null;
		}
		else if( value < CFBamTableBuff.QUALIFYINGTENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalQualifyingTenantId",
				1,
				"value",
				value,
				CFBamTableBuff.QUALIFYINGTENANTID_MIN_VALUE );
		}
		else {
			optionalQualifyingTenantId = value;
		}
	}

	public Long getOptionalQualifyingTableId() {
		return( optionalQualifyingTableId );
	}

	public void setOptionalQualifyingTableId( Long value ) {
		if( value == null ) {
			optionalQualifyingTableId = null;
		}
		else if( value < CFBamTableBuff.QUALIFYINGTABLEID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalQualifyingTableId",
				1,
				"value",
				value,
				CFBamTableBuff.QUALIFYINGTABLEID_MIN_VALUE );
		}
		else {
			optionalQualifyingTableId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamTableByQualTableIdxKey ) {
			CFBamTableByQualTableIdxKey rhs = (CFBamTableByQualTableIdxKey)obj;
			if( getOptionalQualifyingTenantId() != null ) {
				if( rhs.getOptionalQualifyingTenantId() != null ) {
					if( ! getOptionalQualifyingTenantId().equals( rhs.getOptionalQualifyingTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalQualifyingTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalQualifyingTableId() != null ) {
				if( rhs.getOptionalQualifyingTableId() != null ) {
					if( ! getOptionalQualifyingTableId().equals( rhs.getOptionalQualifyingTableId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalQualifyingTableId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFBamTableBuff ) {
			CFBamTableBuff rhs = (CFBamTableBuff)obj;
			if( getOptionalQualifyingTenantId() != null ) {
				if( rhs.getOptionalQualifyingTenantId() != null ) {
					if( ! getOptionalQualifyingTenantId().equals( rhs.getOptionalQualifyingTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalQualifyingTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalQualifyingTableId() != null ) {
				if( rhs.getOptionalQualifyingTableId() != null ) {
					if( ! getOptionalQualifyingTableId().equals( rhs.getOptionalQualifyingTableId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalQualifyingTableId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else {
			return( false );
		}
	}

	public int hashCode() {
		int hashCode = 0;
		if( getOptionalQualifyingTenantId() != null ) {
			hashCode = hashCode + getOptionalQualifyingTenantId().hashCode();
		}
		if( getOptionalQualifyingTableId() != null ) {
			hashCode = hashCode + getOptionalQualifyingTableId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFBamTableByQualTableIdxKey ) {
			CFBamTableByQualTableIdxKey rhs = (CFBamTableByQualTableIdxKey)obj;
			if( getOptionalQualifyingTenantId() != null ) {
				Long lhsQualifyingTenantId = getOptionalQualifyingTenantId();
				if( rhs.getOptionalQualifyingTenantId() != null ) {
					Long rhsQualifyingTenantId = rhs.getOptionalQualifyingTenantId();
					int cmp = lhsQualifyingTenantId.compareTo( rhsQualifyingTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalQualifyingTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalQualifyingTableId() != null ) {
				Long lhsQualifyingTableId = getOptionalQualifyingTableId();
				if( rhs.getOptionalQualifyingTableId() != null ) {
					Long rhsQualifyingTableId = rhs.getOptionalQualifyingTableId();
					int cmp = lhsQualifyingTableId.compareTo( rhsQualifyingTableId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalQualifyingTableId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFBamTableBuff ) {
			CFBamTableBuff rhs = (CFBamTableBuff)obj;
			if( getOptionalQualifyingTenantId() != null ) {
				Long lhsQualifyingTenantId = getOptionalQualifyingTenantId();
				if( rhs.getOptionalQualifyingTenantId() != null ) {
					Long rhsQualifyingTenantId = rhs.getOptionalQualifyingTenantId();
					int cmp = lhsQualifyingTenantId.compareTo( rhsQualifyingTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalQualifyingTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalQualifyingTableId() != null ) {
				Long lhsQualifyingTableId = getOptionalQualifyingTableId();
				if( rhs.getOptionalQualifyingTableId() != null ) {
					Long rhsQualifyingTableId = rhs.getOptionalQualifyingTableId();
					int cmp = lhsQualifyingTableId.compareTo( rhsQualifyingTableId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalQualifyingTableId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	public String toString() {
		String ret = "<CFBamTableByQualTableIdx"
			+ " OptionalQualifyingTenantId=" + ( ( getOptionalQualifyingTenantId() == null ) ? "null" : "\"" + getOptionalQualifyingTenantId().toString() + "\"" )
			+ " OptionalQualifyingTableId=" + ( ( getOptionalQualifyingTableId() == null ) ? "null" : "\"" + getOptionalQualifyingTableId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
