/**
 * Copyright (c) 2023
 */
package ca.tvos.util;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/**
 * A <code>java.io.PrintWriter</code> which invokes <code>flush</code> on every
 * output operation.
 * 
 * All operations which write data are automatically <code>flush</code>ed, i.e.
 * <code>append</code>, <code>print</code>, and <code>write</code> in addition
 * to <code>format</code>, <code>printf</code>, and <code>println</code>.
 * 
 * @author Peter Grey
 */

public class AutoFlushPrintWriter extends PrintWriter {

	/* ********** ********* ******** ******* ****** ***** **** *** ** * */
	/* constructors */
	/* ********** ********* ******** ******* ****** ***** **** *** ** * */

	/**
	 * @param out Target output.
	 */
	public AutoFlushPrintWriter(Writer out) {
		super(out, true);
	}

	/**
	 * PrintWriter using <code>OutputStream</code> with default
	 * <code>Charset</code>.
	 * 
	 * @param out Target <code>OutputStream</code>
	 */
	public AutoFlushPrintWriter(OutputStream out) {
		super(out, true);
	}

	/**
	 * @param out     Target <code>OutputStream</code>
	 * @param charset <code>Charset</code> for encoding.
	 */
	public AutoFlushPrintWriter(OutputStream out, Charset charset) {
		super(out, true, charset);
	}

	/* ********** ********* ******** ******* ****** ***** **** *** ** * */
	/* append */
	/* ********** ********* ******** ******* ****** ***** **** *** ** * */

	@Override
	public PrintWriter append(CharSequence csq) {
		super.append(csq);
		flush();
		return this;
	}

	@Override
	public PrintWriter append(CharSequence csq, int start, int end) {
		super.append(csq, start, end);
		flush();
		return this;
	}

	@Override
	public PrintWriter append(char c) {
		super.append(c);
		flush();
		return this;
	}

	/* ********** ********* ******** ******* ****** ***** **** *** ** * */
	/* print */
	/* ********** ********* ******** ******* ****** ***** **** *** ** * */

	@Override
	public void print(boolean b) {
		super.print(b);
		flush();
	}

	@Override
	public void print(char c) {
		super.print(c);
		flush();
	}

	@Override
	public void print(int i) {
		super.print(i);
		flush();
	}

	@Override
	public void print(long l) {
		super.print(l);
		flush();
	}

	@Override
	public void print(float f) {
		super.print(f);
		flush();
	}

	@Override
	public void print(double d) {
		super.print(d);
		flush();
	}

	@Override
	public void print(char[] s) {
		super.print(s);
		flush();
	}

	@Override
	public void print(String s) {
		super.print(s);
		flush();
	}

	@Override
	public void print(Object obj) {
		super.print(obj);
		flush();
	}

	/* ********** ********* ******** ******* ****** ***** **** *** ** * */
	/* write */
	/* ********** ********* ******** ******* ****** ***** **** *** ** * */

	@Override
	public void write(int c) {
		super.write(c);
		flush();
	}

	@Override
	public void write(char[] buf, int off, int len) {
		super.write(buf, off, len);
		flush();
	}

	@Override
	public void write(char[] buf) {
		super.write(buf);
		flush();
	}

	@Override
	public void write(String s, int off, int len) {
		super.write(s, off, len);
		flush();
	}

	@Override
	public void write(String s) {
		super.write(s);
		flush();
	}

}