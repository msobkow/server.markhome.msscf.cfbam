// Description: Java 11 edit object instance implementation for CFBam NumberDef.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBam.*;

public class CFBamNumberDefEditObj
	extends CFBamAtomEditObj

	implements ICFBamNumberDefEditObj
{

	public CFBamNumberDefEditObj( ICFBamNumberDefObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( CFBamNumberDefObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "NumberDef" );
	}

	public ICFLibAnyObj getScope() {
		return( super.getScope() );
	}

	public ICFLibAnyObj getObjScope() {
		return( super.getObjScope() );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredName();
		return( objName );
	}

	public ICFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		ICFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof ICFBamClusterObj ) {
					break;
				}
				else if( container instanceof ICFBamTenantObj ) {
					break;
				}
				else if( qualifyingClass.isInstance( container ) ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		else {
			while( container != null ) {
				if( container instanceof ICFBamClusterObj ) {
					break;
				}
				else if( container instanceof ICFBamTenantObj ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		return( container );
	}

	public ICFLibAnyObj getNamedObject( String objName ) {
		String nextName;
		String remainingName;
		ICFLibAnyObj subObj = null;
		ICFLibAnyObj retObj;
		int nextDot = objName.indexOf( '.' );
		if( nextDot >= 0 ) {
			nextName = objName.substring( 0, nextDot );
			remainingName = objName.substring( nextDot + 1 );
		}
		else {
			nextName = objName;
			remainingName = null;
		}
		if( remainingName == null ) {
			retObj = subObj;
		}
		else if( subObj == null ) {
			retObj = null;
		}
		else {
			retObj = subObj.getNamedObject( remainingName );
		}
		return( retObj );
	}

	public String getObjQualifiedName() {
		String qualName = getObjName();
		ICFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof ICFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof ICFSecTenantObj ) {
				container = null;
			}
			else if( container instanceof ICFBamSchemaDefObj ) {
				container = null;
			}
			else {
				containerName = container.getObjName();
				qualName = containerName + "." + qualName;
				container = container.getObjScope();
			}
		}
		return( qualName );
	}

	public ICFBamValueObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFBamNumberDefObj retobj = getSchema().getNumberDefTableObj().realiseNumberDef( (ICFBamNumberDefObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsNumberDef().forget();
	}

	public ICFBamValueObj moveUp() {
		throw new CFLibUsageException( getClass(),
			"moveUp",
			"You cannot move an edited object in the chain" );
	}

	public ICFBamValueObj moveDown() {
		throw new CFLibUsageException( getClass(),
			"moveDown",
			"You cannot move an edited object in the chain" );
	}

	public ICFBamValueObj create() {
		copyBuffToOrig();
		ICFBamNumberDefObj retobj = ((ICFBamSchemaObj)getOrigAsNumberDef().getSchema()).getNumberDefTableObj().createNumberDef( getOrigAsNumberDef() );
		if( retobj == getOrigAsNumberDef() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getNumberDefTableObj().updateNumberDef( (ICFBamNumberDefObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getNumberDefTableObj().deleteNumberDef( getOrigAsNumberDef() );
		return( null );
	}

	public ICFBamNumberDefTableObj getNumberDefTable() {
		return( orig.getSchema().getNumberDefTableObj() );
	}

	public ICFBamNumberDefEditObj getEditAsNumberDef() {
		return( (ICFBamNumberDefEditObj)this );
	}

	public ICFBamNumberDefObj getOrigAsNumberDef() {
		return( (ICFBamNumberDefObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsNumberDef().getSchema().getBackingStore()).getFactoryNumberDef().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public CFBamNumberDefBuff getNumberDefBuff() {
		return( (CFBamNumberDefBuff)getBuff() );
	}

	public short getRequiredDigits() {
		return( getNumberDefBuff().getRequiredDigits() );
	}

	public void setRequiredDigits( short value ) {
		if( getNumberDefBuff().getRequiredDigits() != value ) {
			getNumberDefBuff().setRequiredDigits( value );
		}
	}

	public short getRequiredPrecis() {
		return( getNumberDefBuff().getRequiredPrecis() );
	}

	public void setRequiredPrecis( short value ) {
		if( getNumberDefBuff().getRequiredPrecis() != value ) {
			getNumberDefBuff().setRequiredPrecis( value );
		}
	}

	public BigDecimal getOptionalInitValue() {
		return( getNumberDefBuff().getOptionalInitValue() );
	}

	public void setOptionalInitValue( BigDecimal value ) {
		if( getNumberDefBuff().getOptionalInitValue() != value ) {
			getNumberDefBuff().setOptionalInitValue( value );
		}
	}

	public BigDecimal getOptionalMinValue() {
		return( getNumberDefBuff().getOptionalMinValue() );
	}

	public void setOptionalMinValue( BigDecimal value ) {
		if( getNumberDefBuff().getOptionalMinValue() != value ) {
			getNumberDefBuff().setOptionalMinValue( value );
		}
	}

	public BigDecimal getOptionalMaxValue() {
		return( getNumberDefBuff().getOptionalMaxValue() );
	}

	public void setOptionalMaxValue( BigDecimal value ) {
		if( getNumberDefBuff().getOptionalMaxValue() != value ) {
			getNumberDefBuff().setOptionalMaxValue( value );
		}
	}

	public void copyBuffToOrig() {
		CFBamNumberDefBuff origBuff = getOrigAsNumberDef().getNumberDefBuff();
		CFBamNumberDefBuff myBuff = getNumberDefBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamNumberDefBuff origBuff = getOrigAsNumberDef().getNumberDefBuff();
		CFBamNumberDefBuff myBuff = getNumberDefBuff();
		myBuff.set( origBuff );
	}
}
