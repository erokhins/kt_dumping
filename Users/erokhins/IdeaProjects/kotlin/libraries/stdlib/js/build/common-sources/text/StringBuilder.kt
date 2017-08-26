'kotlin.jvm.JvmMultifileClass' @ [1:1] ==> public constructor JvmMultifileClass() defined in kotlin.jvm.JvmMultifileClass[ClassConstructorDescriptorImpl]

'kotlin.jvm.JvmName' @ [2:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[ClassConstructorDescriptorImpl]

'kotlin.internal.InlineOnly' @ [10:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'StringBuilder' @ [12:9] ==> public constructor StringBuilder(content: String = ...) defined in kotlin.text.StringBuilder[ClassConstructorDescriptorImpl]

'apply' @ [12:25] ==> @InlineOnly public inline fun <T> StringBuilder.apply(block: StringBuilder.() -> Unit): StringBuilder defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> StringBuilder

'builderAction' @ [12:31] ==> value-parameter builderAction: StringBuilder.() -> Unit defined in kotlin.text.buildString[ValueParameterDescriptorImpl]

'toString' @ [12:46] ==> public open fun toString(): String defined in kotlin.text.StringBuilder[SimpleFunctionDescriptorImpl]

'SinceKotlin' @ [18:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'kotlin.internal.InlineOnly' @ [19:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'StringBuilder' @ [21:9] ==> public constructor StringBuilder(@Suppress capacity: Int) defined in kotlin.text.StringBuilder[ClassConstructorDescriptorImpl]

'capacity' @ [21:23] ==> value-parameter capacity: Int defined in kotlin.text.buildString[ValueParameterDescriptorImpl]

'apply' @ [21:33] ==> @InlineOnly public inline fun <T> StringBuilder.apply(block: StringBuilder.() -> Unit): StringBuilder defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> StringBuilder

'builderAction' @ [21:39] ==> value-parameter builderAction: StringBuilder.() -> Unit defined in kotlin.text.buildString[ValueParameterDescriptorImpl]

'toString' @ [21:54] ==> public open fun toString(): String defined in kotlin.text.StringBuilder[SimpleFunctionDescriptorImpl]

'value' @ [27:18] ==> value-parameter vararg value: CharSequence? defined in kotlin.text.append[ValueParameterDescriptorImpl]

'append' @ [28:9] ==> public abstract fun append(csq: CharSequence?): Appendable defined in kotlin.text.Appendable[SimpleFunctionDescriptorImpl]

'item' @ [28:16] ==> val item: CharSequence? defined in kotlin.text.append[LocalVariableDescriptor]

'this' @ [29:12] ==> <this> defined in kotlin.text.append[ReceiverParameterDescriptorImpl]

'value' @ [36:18] ==> value-parameter vararg value: String? defined in kotlin.text.append[ValueParameterDescriptorImpl]

'append' @ [37:9] ==> public open fun append(csq: CharSequence?): StringBuilder defined in kotlin.text.StringBuilder[SimpleFunctionDescriptorImpl]

'item' @ [37:16] ==> val item: String? defined in kotlin.text.append[LocalVariableDescriptor]

'this' @ [38:12] ==> <this> defined in kotlin.text.append[ReceiverParameterDescriptorImpl]

'value' @ [45:18] ==> value-parameter vararg value: Any? defined in kotlin.text.append[ValueParameterDescriptorImpl]

'append' @ [46:9] ==> public final fun append(obj: Any?): StringBuilder defined in kotlin.text.StringBuilder[SimpleFunctionDescriptorImpl]

'item' @ [46:16] ==> val item: Any? defined in kotlin.text.append[LocalVariableDescriptor]

'this' @ [47:12] ==> <this> defined in kotlin.text.append[ReceiverParameterDescriptorImpl]

'when {
        transform != null -> append(transform(element))
        element is CharSequence? -> append(element)
        element is Char -> append(element)
        else -> append(element.toString())
    }' @ [59:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Appendable, entry1: Appendable, entry2: Appendable, entry3: Appendable): Appendable[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Appendable

'transform' @ [60:9] ==> value-parameter transform: ((T) -> CharSequence)? defined in kotlin.text.appendElement[ValueParameterDescriptorImpl]

'append' @ [60:30] ==> public abstract fun append(csq: CharSequence?): Appendable defined in kotlin.text.Appendable[SimpleFunctionDescriptorImpl]

'invoke' @ [60:37] ==> public abstract operator fun invoke(p1: T): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [60:47] ==> value-parameter element: T defined in kotlin.text.appendElement[ValueParameterDescriptorImpl]

'element' @ [61:9] ==> value-parameter element: T defined in kotlin.text.appendElement[ValueParameterDescriptorImpl]

'append' @ [61:37] ==> public abstract fun append(csq: CharSequence?): Appendable defined in kotlin.text.Appendable[SimpleFunctionDescriptorImpl]

'element' @ [61:44] ==> value-parameter element: T defined in kotlin.text.appendElement[ValueParameterDescriptorImpl]

'element' @ [62:9] ==> value-parameter element: T defined in kotlin.text.appendElement[ValueParameterDescriptorImpl]

'append' @ [62:28] ==> public abstract fun append(c: Char): Appendable defined in kotlin.text.Appendable[SimpleFunctionDescriptorImpl]

'element' @ [62:35] ==> value-parameter element: T defined in kotlin.text.appendElement[ValueParameterDescriptorImpl]

'append' @ [63:17] ==> public abstract fun append(csq: CharSequence?): Appendable defined in kotlin.text.Appendable[SimpleFunctionDescriptorImpl]

'element' @ [63:24] ==> value-parameter element: T defined in kotlin.text.appendElement[ValueParameterDescriptorImpl]

'toString' @ [63:32] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

