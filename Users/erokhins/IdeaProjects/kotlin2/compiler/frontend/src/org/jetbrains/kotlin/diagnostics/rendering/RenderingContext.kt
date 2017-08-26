'RenderingContext' @ [29:65] ==> private constructor RenderingContext() defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext[ClassConstructorDescriptorImpl]

'linkedMapOf' @ [30:28] ==> @SinceKotlin @InlineOnly public inline fun <K, V> linkedMapOf(): LinkedHashMap<RenderingContext.Key<*>, Any?> /* = LinkedHashMap<RenderingContext.Key<*>, Any?> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Key<*>
    <V> -> Any?

'!' @ [33:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'data' @ [33:18] ==> private final val data: LinkedHashMap<RenderingContext.Key<*>, Any?> /* = LinkedHashMap<RenderingContext.Key<*>, Any?> */ defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Impl[PropertyDescriptorImpl]

'containsKey' @ [33:23] ==> public open fun containsKey(key: RenderingContext.Key<*>): Boolean defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'key' @ [33:35] ==> value-parameter key: RenderingContext.Key<T> defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Impl.get[ValueParameterDescriptorImpl]

'key' @ [34:30] ==> value-parameter key: RenderingContext.Key<T> defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Impl.get[ValueParameterDescriptorImpl]

'compute' @ [34:34] ==> public abstract fun compute(objectsToRender: Collection<Any?>): T defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Key[SimpleFunctionDescriptorImpl]

'objectsToRender' @ [34:42] ==> private final val objectsToRender: Collection<Any?> defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Impl[PropertyDescriptorImpl]

'data' @ [35:17] ==> private final val data: LinkedHashMap<RenderingContext.Key<*>, Any?> /* = LinkedHashMap<RenderingContext.Key<*>, Any?> */ defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Impl[PropertyDescriptorImpl]

'key' @ [35:22] ==> value-parameter key: RenderingContext.Key<T> defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Impl.get[ValueParameterDescriptorImpl]

'result' @ [35:29] ==> val result: T defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Impl.get[LocalVariableDescriptor]

'result' @ [36:24] ==> val result: T defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Impl.get[LocalVariableDescriptor]

'data' @ [38:20] ==> private final val data: LinkedHashMap<RenderingContext.Key<*>, Any?> /* = LinkedHashMap<RenderingContext.Key<*>, Any?> */ defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Impl[PropertyDescriptorImpl]

'key' @ [38:25] ==> value-parameter key: RenderingContext.Key<T> defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Impl.get[ValueParameterDescriptorImpl]

'RenderingContext' @ [43:20] ==> private constructor RenderingContext() defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext[ClassConstructorDescriptorImpl]

'key' @ [45:20] ==> value-parameter key: RenderingContext.Key<T> defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Empty.get[ValueParameterDescriptorImpl]

'compute' @ [45:24] ==> public abstract fun compute(objectsToRender: Collection<Any?>): T defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Key[SimpleFunctionDescriptorImpl]

'emptyList' @ [45:32] ==> public fun <T> emptyList(): List<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'JvmStatic' @ [50:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'Impl' @ [52:20] ==> public constructor Impl(objectsToRender: Collection<Any?>) defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Impl[ClassConstructorDescriptorImpl]

'objectsToRender' @ [52:25] ==> value-parameter vararg objectsToRender: Any? defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Companion.of[ValueParameterDescriptorImpl]

'toList' @ [52:41] ==> public fun <T> Array<out Any?>.toList(): List<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'JvmStatic' @ [55:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'when (d) {
                is SimpleDiagnostic<*> -> listOf()
                is DiagnosticWithParameters1<*, *> -> listOf(d.a)
                is DiagnosticWithParameters2<*, *, *> -> listOf(d.a, d.b)
                is DiagnosticWithParameters3<*, *, *, *> -> listOf(d.a, d.b, d.c)
                is ParametrizedDiagnostic<*> -> error("Unexpected diagnostic: ${d::class.java}")
                else -> listOf()
            }' @ [57:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<(Any..Any?)>, entry1: List<(Any..Any?)>, entry2: List<(Any..Any?)>, entry3: List<(Any..Any?)>, entry4: List<(Any..Any?)>, entry5: List<(Any..Any?)>): List<(Any..Any?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<(kotlin.Any..kotlin.Any?)>

'd' @ [57:36] ==> value-parameter d: Diagnostic defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Companion.fromDiagnostic[ValueParameterDescriptorImpl]

'listOf' @ [58:43] ==> @InlineOnly public inline fun <T> listOf(): List<(Any..Any?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'listOf' @ [59:55] ==> public fun <T> listOf(element: (Any..Any?)): List<(Any..Any?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'd' @ [59:62] ==> value-parameter d: Diagnostic defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Companion.fromDiagnostic[ValueParameterDescriptorImpl]

'a' @ [59:64] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<out (PsiElement..PsiElement?), out (Any..Any?)>.a: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'listOf' @ [60:58] ==> public fun <T> listOf(vararg elements: Any): List<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'd' @ [60:65] ==> value-parameter d: Diagnostic defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Companion.fromDiagnostic[ValueParameterDescriptorImpl]

'a' @ [60:67] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<out (PsiElement..PsiElement?), out (Any..Any?), out (Any..Any?)>.a: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)
    <B : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'd' @ [60:70] ==> value-parameter d: Diagnostic defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Companion.fromDiagnostic[ValueParameterDescriptorImpl]

'b' @ [60:72] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<out (PsiElement..PsiElement?), out (Any..Any?), out (Any..Any?)>.b: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)
    <B : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'listOf' @ [61:61] ==> public fun <T> listOf(vararg elements: Any): List<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'd' @ [61:68] ==> value-parameter d: Diagnostic defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Companion.fromDiagnostic[ValueParameterDescriptorImpl]

'a' @ [61:70] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?), C : (Any..Any?)> DiagnosticWithParameters3<out (PsiElement..PsiElement?), out (Any..Any?), out (Any..Any?), out (Any..Any?)>.a: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)
    <B : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)
    <C : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'd' @ [61:73] ==> value-parameter d: Diagnostic defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Companion.fromDiagnostic[ValueParameterDescriptorImpl]

'b' @ [61:75] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?), C : (Any..Any?)> DiagnosticWithParameters3<out (PsiElement..PsiElement?), out (Any..Any?), out (Any..Any?), out (Any..Any?)>.b: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)
    <B : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)
    <C : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'd' @ [61:78] ==> value-parameter d: Diagnostic defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Companion.fromDiagnostic[ValueParameterDescriptorImpl]

'c' @ [61:80] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?), C : (Any..Any?)> DiagnosticWithParameters3<out (PsiElement..PsiElement?), out (Any..Any?), out (Any..Any?), out (Any..Any?)>.c: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)
    <B : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)
    <C : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'error' @ [62:49] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'd' @ [62:81] ==> value-parameter d: Diagnostic defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Companion.fromDiagnostic[ValueParameterDescriptorImpl]

'java' @ [62:90] ==> public val <T> KClass<out Diagnostic>.java: Class<out Diagnostic> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Diagnostic

'listOf' @ [63:25] ==> @InlineOnly public inline fun <T> listOf(): List<(Any..Any?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'Impl' @ [65:20] ==> public constructor Impl(objectsToRender: Collection<Any?>) defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Impl[ClassConstructorDescriptorImpl]

'parameters' @ [65:25] ==> val parameters: List<(Any..Any?)> defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Companion.fromDiagnostic[LocalVariableDescriptor]

