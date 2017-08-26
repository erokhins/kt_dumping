'compile' @ [11:64] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'run' @ [11:100] ==> @InlineOnly public inline fun <T, R> (Pattern..Pattern?).run(block: (Pattern..Pattern?).() -> TextFormatter<BigDecimal>): TextFormatter<BigDecimal> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.util.regex.Pattern..java.util.regex.Pattern?)
    <R> -> TextFormatter<BigDecimal>

'TextFormatter' @ [12:5] ==> public constructor TextFormatter<V : (Any..Any?)>(@NamedArg p0: (StringConverter<(BigDecimal..BigDecimal?)>..StringConverter<(BigDecimal..BigDecimal?)>?), @NamedArg p1: (BigDecimal..BigDecimal?), @NamedArg p2: (((TextFormatter.Change..TextFormatter.Change?)) -> (TextFormatter.Change..TextFormatter.Change?)..(((TextFormatter.Change..TextFormatter.Change?)) -> (TextFormatter.Change..TextFormatter.Change?))?)) defined in javafx.scene.control.TextFormatter[SamAdapterClassConstructorDescriptor]
Inferred types:
    <V : (Any..Any?)> -> BigDecimal

'BigDecimalStringConverter' @ [12:31] ==> public constructor BigDecimalStringConverter() defined in javafx.util.converter.BigDecimalStringConverter[JavaClassConstructorDescriptor]

'change' @ [13:23] ==> value-parameter change: (TextFormatter.Change..TextFormatter.Change?) defined in net.corda.explorer.views.bigDecimalFormatter.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'controlNewText' @ [13:30] ==> public final val TextFormatter.Change.controlNewText: (String..String?)[MyPropertyDescriptor]

'if (matcher(newText).matches()) change else null' @ [14:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (TextFormatter.Change..TextFormatter.Change?), elseBranch: (TextFormatter.Change..TextFormatter.Change?)): (TextFormatter.Change..TextFormatter.Change?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (javafx.scene.control.TextFormatter.Change..javafx.scene.control.TextFormatter.Change?)

'matcher' @ [14:13] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'newText' @ [14:21] ==> val newText: (String..String?) defined in net.corda.explorer.views.bigDecimalFormatter.<anonymous>.<anonymous>[LocalVariableDescriptor]

'matches' @ [14:30] ==> public open fun matches(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'change' @ [14:41] ==> value-parameter change: (TextFormatter.Change..TextFormatter.Change?) defined in net.corda.explorer.views.bigDecimalFormatter.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'compile' @ [19:52] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'run' @ [19:68] ==> @InlineOnly public inline fun <T, R> (Pattern..Pattern?).run(block: (Pattern..Pattern?).() -> TextFormatter<Byte>): TextFormatter<Byte> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.util.regex.Pattern..java.util.regex.Pattern?)
    <R> -> TextFormatter<Byte>

'TextFormatter' @ [20:5] ==> public constructor TextFormatter<V : (Any..Any?)>(@NamedArg p0: (StringConverter<(Byte..Byte?)>..StringConverter<(Byte..Byte?)>?), @NamedArg p1: (Byte..Byte?), @NamedArg p2: (((TextFormatter.Change..TextFormatter.Change?)) -> (TextFormatter.Change..TextFormatter.Change?)..(((TextFormatter.Change..TextFormatter.Change?)) -> (TextFormatter.Change..TextFormatter.Change?))?)) defined in javafx.scene.control.TextFormatter[SamAdapterClassConstructorDescriptor]
Inferred types:
    <V : (Any..Any?)> -> Byte

'ByteStringConverter' @ [20:25] ==> public constructor ByteStringConverter() defined in javafx.util.converter.ByteStringConverter[JavaClassConstructorDescriptor]

'change' @ [21:23] ==> value-parameter change: (TextFormatter.Change..TextFormatter.Change?) defined in net.corda.explorer.views.byteFormatter.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'controlNewText' @ [21:30] ==> public final val TextFormatter.Change.controlNewText: (String..String?)[MyPropertyDescriptor]

'if (matcher(newText).matches()) change else null' @ [22:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (TextFormatter.Change..TextFormatter.Change?), elseBranch: (TextFormatter.Change..TextFormatter.Change?)): (TextFormatter.Change..TextFormatter.Change?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (javafx.scene.control.TextFormatter.Change..javafx.scene.control.TextFormatter.Change?)

'matcher' @ [22:13] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'newText' @ [22:21] ==> val newText: (String..String?) defined in net.corda.explorer.views.byteFormatter.<anonymous>.<anonymous>[LocalVariableDescriptor]

'matches' @ [22:30] ==> public open fun matches(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'change' @ [22:41] ==> value-parameter change: (TextFormatter.Change..TextFormatter.Change?) defined in net.corda.explorer.views.byteFormatter.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'compile' @ [27:50] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'run' @ [27:66] ==> @InlineOnly public inline fun <T, R> (Pattern..Pattern?).run(block: (Pattern..Pattern?).() -> TextFormatter<Int>): TextFormatter<Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.util.regex.Pattern..java.util.regex.Pattern?)
    <R> -> TextFormatter<Int>

'TextFormatter' @ [28:5] ==> public constructor TextFormatter<V : (Any..Any?)>(@NamedArg p0: (StringConverter<(Int..Int?)>..StringConverter<(Int..Int?)>?), @NamedArg p1: (Int..Int?), @NamedArg p2: (((TextFormatter.Change..TextFormatter.Change?)) -> (TextFormatter.Change..TextFormatter.Change?)..(((TextFormatter.Change..TextFormatter.Change?)) -> (TextFormatter.Change..TextFormatter.Change?))?)) defined in javafx.scene.control.TextFormatter[SamAdapterClassConstructorDescriptor]
Inferred types:
    <V : (Any..Any?)> -> Int

'IntegerStringConverter' @ [28:24] ==> public constructor IntegerStringConverter() defined in javafx.util.converter.IntegerStringConverter[JavaClassConstructorDescriptor]

'change' @ [29:23] ==> value-parameter change: (TextFormatter.Change..TextFormatter.Change?) defined in net.corda.explorer.views.intFormatter.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'controlNewText' @ [29:30] ==> public final val TextFormatter.Change.controlNewText: (String..String?)[MyPropertyDescriptor]

'if (matcher(newText).matches()) change else null' @ [30:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (TextFormatter.Change..TextFormatter.Change?), elseBranch: (TextFormatter.Change..TextFormatter.Change?)): (TextFormatter.Change..TextFormatter.Change?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (javafx.scene.control.TextFormatter.Change..javafx.scene.control.TextFormatter.Change?)

'matcher' @ [30:13] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'newText' @ [30:21] ==> val newText: (String..String?) defined in net.corda.explorer.views.intFormatter.<anonymous>.<anonymous>[LocalVariableDescriptor]

'matches' @ [30:30] ==> public open fun matches(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'change' @ [30:41] ==> value-parameter change: (TextFormatter.Change..TextFormatter.Change?) defined in net.corda.explorer.views.intFormatter.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

