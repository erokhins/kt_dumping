'MessageFormat' @ [24:33] ==> public constructor MessageFormat(p0: (String..String?)) defined in java.text.MessageFormat[JavaClassConstructorDescriptor]

'message' @ [24:47] ==> value-parameter message: String defined in org.jetbrains.kotlin.diagnostics.rendering.AbstractDiagnosticWithParametersRenderer.<init>[ValueParameterDescriptorImpl]

'messageFormat' @ [27:16] ==> private final val messageFormat: MessageFormat defined in org.jetbrains.kotlin.diagnostics.rendering.AbstractDiagnosticWithParametersRenderer[PropertyDescriptorImpl]

'format' @ [27:30] ==> public final fun format(p0: (Any..Any?)): (String..String?) defined in java.text.MessageFormat[JavaMethodDescriptor]

'renderParameters' @ [27:37] ==> public abstract fun renderParameters(diagnostic: D): Array<out Any> defined in org.jetbrains.kotlin.diagnostics.rendering.AbstractDiagnosticWithParametersRenderer[SimpleFunctionDescriptorImpl]

'obj' @ [27:54] ==> value-parameter obj: D defined in org.jetbrains.kotlin.diagnostics.rendering.AbstractDiagnosticWithParametersRenderer.render[ValueParameterDescriptorImpl]

'AbstractDiagnosticWithParametersRenderer<DiagnosticWithParameters1<*, A>>' @ [38:5] ==> protected constructor AbstractDiagnosticWithParametersRenderer<D : Diagnostic>(message: String) defined in org.jetbrains.kotlin.diagnostics.rendering.AbstractDiagnosticWithParametersRenderer[ClassConstructorDescriptorImpl]
Inferred types:
    <D : Diagnostic> -> DiagnosticWithParameters1<*, A>

'message' @ [38:79] ==> value-parameter message: String defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters1Renderer.<init>[ValueParameterDescriptorImpl]

'RenderingContext' @ [41:23] ==> public companion object defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext[FakeCallableDescriptorForObject]

'of' @ [41:40] ==> @JvmStatic public final fun of(vararg objectsToRender: Any?): RenderingContext defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Companion[SimpleFunctionDescriptorImpl]

'diagnostic' @ [41:43] ==> value-parameter diagnostic: DiagnosticWithParameters1<*, A> defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters1Renderer.renderParameters[ValueParameterDescriptorImpl]

'a' @ [41:54] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<out (PsiElement..PsiElement?), A>.a: A[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> Captured(*)
    <A : (Any..Any?)> -> A

'arrayOf' @ [42:16] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Any): Array<Any> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Any

'renderParameter' @ [42:24] ==> public fun <P : Any> renderParameter(parameter: A, renderer: DiagnosticParameterRenderer<A>?, context: RenderingContext): Any defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : Any> -> A

'diagnostic' @ [42:40] ==> value-parameter diagnostic: DiagnosticWithParameters1<*, A> defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters1Renderer.renderParameters[ValueParameterDescriptorImpl]

'a' @ [42:51] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<out (PsiElement..PsiElement?), A>.a: A[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> Captured(*)
    <A : (Any..Any?)> -> A

'rendererForA' @ [42:54] ==> private final val rendererForA: DiagnosticParameterRenderer<A>? defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters1Renderer[PropertyDescriptorImpl]

'context' @ [42:68] ==> val context: RenderingContext defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters1Renderer.renderParameters[LocalVariableDescriptor]

'AbstractDiagnosticWithParametersRenderer<DiagnosticWithParameters2<*, A, B>>' @ [50:5] ==> protected constructor AbstractDiagnosticWithParametersRenderer<D : Diagnostic>(message: String) defined in org.jetbrains.kotlin.diagnostics.rendering.AbstractDiagnosticWithParametersRenderer[ClassConstructorDescriptorImpl]
Inferred types:
    <D : Diagnostic> -> DiagnosticWithParameters2<*, A, B>

'message' @ [50:82] ==> value-parameter message: String defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters2Renderer.<init>[ValueParameterDescriptorImpl]

'RenderingContext' @ [53:23] ==> public companion object defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext[FakeCallableDescriptorForObject]

'of' @ [53:40] ==> @JvmStatic public final fun of(vararg objectsToRender: Any?): RenderingContext defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Companion[SimpleFunctionDescriptorImpl]

'diagnostic' @ [53:43] ==> value-parameter diagnostic: DiagnosticWithParameters2<*, A, B> defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters2Renderer.renderParameters[ValueParameterDescriptorImpl]

'a' @ [53:54] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<out (PsiElement..PsiElement?), A, B>.a: A[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> Captured(*)
    <A : (Any..Any?)> -> A
    <B : (Any..Any?)> -> B

'diagnostic' @ [53:57] ==> value-parameter diagnostic: DiagnosticWithParameters2<*, A, B> defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters2Renderer.renderParameters[ValueParameterDescriptorImpl]

'b' @ [53:68] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<out (PsiElement..PsiElement?), A, B>.b: B[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> Captured(*)
    <A : (Any..Any?)> -> A
    <B : (Any..Any?)> -> B

'arrayOf' @ [54:16] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Any): Array<Any> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Any

'renderParameter' @ [55:17] ==> public fun <P : Any> renderParameter(parameter: A, renderer: DiagnosticParameterRenderer<A>?, context: RenderingContext): Any defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : Any> -> A

'diagnostic' @ [55:33] ==> value-parameter diagnostic: DiagnosticWithParameters2<*, A, B> defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters2Renderer.renderParameters[ValueParameterDescriptorImpl]

'a' @ [55:44] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<out (PsiElement..PsiElement?), A, B>.a: A[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> Captured(*)
    <A : (Any..Any?)> -> A
    <B : (Any..Any?)> -> B

'rendererForA' @ [55:47] ==> private final val rendererForA: DiagnosticParameterRenderer<A>? defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters2Renderer[PropertyDescriptorImpl]

'context' @ [55:61] ==> val context: RenderingContext defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters2Renderer.renderParameters[LocalVariableDescriptor]

'renderParameter' @ [56:17] ==> public fun <P : Any> renderParameter(parameter: B, renderer: DiagnosticParameterRenderer<B>?, context: RenderingContext): Any defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : Any> -> B

'diagnostic' @ [56:33] ==> value-parameter diagnostic: DiagnosticWithParameters2<*, A, B> defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters2Renderer.renderParameters[ValueParameterDescriptorImpl]

'b' @ [56:44] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<out (PsiElement..PsiElement?), A, B>.b: B[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> Captured(*)
    <A : (Any..Any?)> -> A
    <B : (Any..Any?)> -> B

'rendererForB' @ [56:47] ==> private final val rendererForB: DiagnosticParameterRenderer<B>? defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters2Renderer[PropertyDescriptorImpl]

'context' @ [56:61] ==> val context: RenderingContext defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters2Renderer.renderParameters[LocalVariableDescriptor]

'AbstractDiagnosticWithParametersRenderer<DiagnosticWithParameters3<*, A, B, C>>' @ [66:5] ==> protected constructor AbstractDiagnosticWithParametersRenderer<D : Diagnostic>(message: String) defined in org.jetbrains.kotlin.diagnostics.rendering.AbstractDiagnosticWithParametersRenderer[ClassConstructorDescriptorImpl]
Inferred types:
    <D : Diagnostic> -> DiagnosticWithParameters3<*, A, B, C>

'message' @ [66:85] ==> value-parameter message: String defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters3Renderer.<init>[ValueParameterDescriptorImpl]

'RenderingContext' @ [69:23] ==> public companion object defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext[FakeCallableDescriptorForObject]

'of' @ [69:40] ==> @JvmStatic public final fun of(vararg objectsToRender: Any?): RenderingContext defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Companion[SimpleFunctionDescriptorImpl]

'diagnostic' @ [69:43] ==> value-parameter diagnostic: DiagnosticWithParameters3<*, A, B, C> defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters3Renderer.renderParameters[ValueParameterDescriptorImpl]

'a' @ [69:54] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?), C : (Any..Any?)> DiagnosticWithParameters3<out (PsiElement..PsiElement?), A, B, C>.a: A[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> Captured(*)
    <A : (Any..Any?)> -> A
    <B : (Any..Any?)> -> B
    <C : (Any..Any?)> -> C

'diagnostic' @ [69:57] ==> value-parameter diagnostic: DiagnosticWithParameters3<*, A, B, C> defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters3Renderer.renderParameters[ValueParameterDescriptorImpl]

'b' @ [69:68] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?), C : (Any..Any?)> DiagnosticWithParameters3<out (PsiElement..PsiElement?), A, B, C>.b: B[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> Captured(*)
    <A : (Any..Any?)> -> A
    <B : (Any..Any?)> -> B
    <C : (Any..Any?)> -> C

'diagnostic' @ [69:71] ==> value-parameter diagnostic: DiagnosticWithParameters3<*, A, B, C> defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters3Renderer.renderParameters[ValueParameterDescriptorImpl]

'c' @ [69:82] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?), C : (Any..Any?)> DiagnosticWithParameters3<out (PsiElement..PsiElement?), A, B, C>.c: C[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> Captured(*)
    <A : (Any..Any?)> -> A
    <B : (Any..Any?)> -> B
    <C : (Any..Any?)> -> C

'arrayOf' @ [70:16] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Any): Array<Any> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Any

'renderParameter' @ [71:17] ==> public fun <P : Any> renderParameter(parameter: A, renderer: DiagnosticParameterRenderer<A>?, context: RenderingContext): Any defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : Any> -> A

'diagnostic' @ [71:33] ==> value-parameter diagnostic: DiagnosticWithParameters3<*, A, B, C> defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters3Renderer.renderParameters[ValueParameterDescriptorImpl]

'a' @ [71:44] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?), C : (Any..Any?)> DiagnosticWithParameters3<out (PsiElement..PsiElement?), A, B, C>.a: A[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> Captured(*)
    <A : (Any..Any?)> -> A
    <B : (Any..Any?)> -> B
    <C : (Any..Any?)> -> C

'rendererForA' @ [71:47] ==> private final val rendererForA: DiagnosticParameterRenderer<A>? defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters3Renderer[PropertyDescriptorImpl]

'context' @ [71:61] ==> val context: RenderingContext defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters3Renderer.renderParameters[LocalVariableDescriptor]

'renderParameter' @ [72:17] ==> public fun <P : Any> renderParameter(parameter: B, renderer: DiagnosticParameterRenderer<B>?, context: RenderingContext): Any defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : Any> -> B

'diagnostic' @ [72:33] ==> value-parameter diagnostic: DiagnosticWithParameters3<*, A, B, C> defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters3Renderer.renderParameters[ValueParameterDescriptorImpl]

'b' @ [72:44] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?), C : (Any..Any?)> DiagnosticWithParameters3<out (PsiElement..PsiElement?), A, B, C>.b: B[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> Captured(*)
    <A : (Any..Any?)> -> A
    <B : (Any..Any?)> -> B
    <C : (Any..Any?)> -> C

'rendererForB' @ [72:47] ==> private final val rendererForB: DiagnosticParameterRenderer<B>? defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters3Renderer[PropertyDescriptorImpl]

'context' @ [72:61] ==> val context: RenderingContext defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters3Renderer.renderParameters[LocalVariableDescriptor]

'renderParameter' @ [73:17] ==> public fun <P : Any> renderParameter(parameter: C, renderer: DiagnosticParameterRenderer<C>?, context: RenderingContext): Any defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : Any> -> C

'diagnostic' @ [73:33] ==> value-parameter diagnostic: DiagnosticWithParameters3<*, A, B, C> defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters3Renderer.renderParameters[ValueParameterDescriptorImpl]

'c' @ [73:44] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?), C : (Any..Any?)> DiagnosticWithParameters3<out (PsiElement..PsiElement?), A, B, C>.c: C[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> Captured(*)
    <A : (Any..Any?)> -> A
    <B : (Any..Any?)> -> B
    <C : (Any..Any?)> -> C

'rendererForC' @ [73:47] ==> private final val rendererForC: DiagnosticParameterRenderer<C>? defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters3Renderer[PropertyDescriptorImpl]

'context' @ [73:61] ==> val context: RenderingContext defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParameters3Renderer.renderParameters[LocalVariableDescriptor]

'AbstractDiagnosticWithParametersRenderer<DiagnosticWithParameters1<*, A>>' @ [81:5] ==> protected constructor AbstractDiagnosticWithParametersRenderer<D : Diagnostic>(message: String) defined in org.jetbrains.kotlin.diagnostics.rendering.AbstractDiagnosticWithParametersRenderer[ClassConstructorDescriptorImpl]
Inferred types:
    <D : Diagnostic> -> DiagnosticWithParameters1<*, A>

'message' @ [81:79] ==> value-parameter message: String defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParametersMultiRenderer.<init>[ValueParameterDescriptorImpl]

'renderer' @ [84:16] ==> private final val renderer: MultiRenderer<A> defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParametersMultiRenderer[PropertyDescriptorImpl]

'render' @ [84:25] ==> public abstract fun render(a: A): Array<String> defined in org.jetbrains.kotlin.diagnostics.rendering.MultiRenderer[SimpleFunctionDescriptorImpl]

'diagnostic' @ [84:32] ==> value-parameter diagnostic: DiagnosticWithParameters1<*, A> defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticWithParametersMultiRenderer.renderParameters[ValueParameterDescriptorImpl]

'a' @ [84:43] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<out (PsiElement..PsiElement?), A>.a: A[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> Captured(*)
    <A : (Any..Any?)> -> A

