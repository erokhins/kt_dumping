'when {
                line < other.line -> -1
                line > other.line -> 1
                else -> offset.compareTo(other.offset)
            }' @ [21:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'line' @ [22:17] ==> public final val line: Int defined in com.google.gwt.dev.js.rhino.CodePosition[PropertyDescriptorImpl]

'other' @ [22:24] ==> value-parameter other: CodePosition defined in com.google.gwt.dev.js.rhino.CodePosition.compareTo[ValueParameterDescriptorImpl]

'line' @ [22:30] ==> public final val line: Int defined in com.google.gwt.dev.js.rhino.CodePosition[PropertyDescriptorImpl]

'-' @ [22:38] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'line' @ [23:17] ==> public final val line: Int defined in com.google.gwt.dev.js.rhino.CodePosition[PropertyDescriptorImpl]

'other' @ [23:24] ==> value-parameter other: CodePosition defined in com.google.gwt.dev.js.rhino.CodePosition.compareTo[ValueParameterDescriptorImpl]

'line' @ [23:30] ==> public final val line: Int defined in com.google.gwt.dev.js.rhino.CodePosition[PropertyDescriptorImpl]

'offset' @ [24:25] ==> public final val offset: Int defined in com.google.gwt.dev.js.rhino.CodePosition[PropertyDescriptorImpl]

'compareTo' @ [24:32] ==> public open fun compareTo(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'other' @ [24:42] ==> value-parameter other: CodePosition defined in com.google.gwt.dev.js.rhino.CodePosition.compareTo[ValueParameterDescriptorImpl]

'offset' @ [24:48] ==> public final val offset: Int defined in com.google.gwt.dev.js.rhino.CodePosition[PropertyDescriptorImpl]

'line' @ [27:42] ==> public final val line: Int defined in com.google.gwt.dev.js.rhino.CodePosition[PropertyDescriptorImpl]

'offset' @ [27:49] ==> public final val offset: Int defined in com.google.gwt.dev.js.rhino.CodePosition[PropertyDescriptorImpl]

