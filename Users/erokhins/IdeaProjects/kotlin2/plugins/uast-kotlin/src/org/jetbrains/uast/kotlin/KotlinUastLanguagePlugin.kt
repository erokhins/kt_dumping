'lz' @ [52:31] ==> internal fun <T> lz(initializer: () -> UastLanguagePlugin): Lazy<UastLanguagePlugin> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> UastLanguagePlugin

'UastLanguagePlugin' @ [52:36] ==> public companion object defined in org.jetbrains.uast.UastLanguagePlugin[FakeCallableDescriptorForObject]

'getInstances' @ [52:55] ==> public final fun getInstances(): Collection<UastLanguagePlugin> defined in org.jetbrains.uast.UastLanguagePlugin.Companion[DeserializedSimpleFunctionDescriptor]

'first' @ [52:70] ==> public inline fun <T> Iterable<UastLanguagePlugin>.first(predicate: (UastLanguagePlugin) -> Boolean): UastLanguagePlugin defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UastLanguagePlugin

'it' @ [52:78] ==> value-parameter it: UastLanguagePlugin defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.javaPlugin.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'INSTANCE' @ [55:32] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'fileName' @ [58:16] ==> value-parameter fileName: String defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.isFileSupported[ValueParameterDescriptorImpl]

'endsWith' @ [58:25] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fileName' @ [58:51] ==> value-parameter fileName: String defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.isFileSupported[ValueParameterDescriptorImpl]

'endsWith' @ [58:60] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'convertDeclaration' @ [62:16] ==> private final fun convertDeclaration(element: PsiElement, parentCallback: (() -> UElement?)?, requiredType: Class<out UElement>?): UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin[SimpleFunctionDescriptorImpl]

'element' @ [62:35] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElement[ValueParameterDescriptorImpl]

'parent' @ [62:44] ==> value-parameter parent: UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElement[ValueParameterDescriptorImpl]

'toCallback' @ [62:51] ==> internal fun UElement?.toCallback(): (() -> UElement?)? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]

'requiredType' @ [62:65] ==> value-parameter requiredType: Class<out UElement>? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElement[ValueParameterDescriptorImpl]

'KotlinConverter' @ [63:19] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'convertPsiElement' @ [63:35] ==> internal final fun convertPsiElement(element: PsiElement?, parentCallback: (() -> UElement?)?, requiredType: Class<out UElement>?): UElement? defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'element' @ [63:53] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElement[ValueParameterDescriptorImpl]

'parent' @ [63:62] ==> value-parameter parent: UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElement[ValueParameterDescriptorImpl]

'toCallback' @ [63:69] ==> internal fun UElement?.toCallback(): (() -> UElement?)? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]

'requiredType' @ [63:83] ==> value-parameter requiredType: Class<out UElement>? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElement[ValueParameterDescriptorImpl]

'element' @ [67:13] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElementWithParent[ValueParameterDescriptorImpl]

'convertDeclaration' @ [67:40] ==> private final fun convertDeclaration(element: PsiElement, parentCallback: (() -> UElement?)?, requiredType: Class<out UElement>?): UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin[SimpleFunctionDescriptorImpl]

'element' @ [67:59] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElementWithParent[ValueParameterDescriptorImpl]

'requiredType' @ [67:74] ==> value-parameter requiredType: Class<out UElement>? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElementWithParent[ValueParameterDescriptorImpl]

'element' @ [68:13] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElementWithParent[ValueParameterDescriptorImpl]

'convertDeclaration' @ [68:54] ==> private final fun convertDeclaration(element: PsiElement, parentCallback: (() -> UElement?)?, requiredType: Class<out UElement>?): UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin[SimpleFunctionDescriptorImpl]

'element' @ [68:73] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElementWithParent[ValueParameterDescriptorImpl]

'requiredType' @ [68:88] ==> value-parameter requiredType: Class<out UElement>? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElementWithParent[ValueParameterDescriptorImpl]

'element' @ [71:26] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElementWithParent[ValueParameterDescriptorImpl]

'parent' @ [71:34] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'KotlinConverter' @ [72:35] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'unwrapElements' @ [72:51] ==> internal final tailrec fun unwrapElements(element: PsiElement?): PsiElement? defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'parent' @ [72:66] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElementWithParent.<no name provided>[LocalVariableDescriptor]

'if (parent is KtValueArgument && parentUnwrapped is KtAnnotationEntry) {
                val argumentName = parent.getArgumentName()?.asName?.asString() ?: ""
                return (convertElementWithParent(parentUnwrapped, null) as? UAnnotation)
                        ?.attributeValues?.find { it.name == argumentName }
            }
            else
                return convertElementWithParent(parentUnwrapped, null)' @ [73:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'parent' @ [73:17] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElementWithParent.<no name provided>[LocalVariableDescriptor]

'parentUnwrapped' @ [73:46] ==> val parentUnwrapped: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElementWithParent.<no name provided>[LocalVariableDescriptor]

'parent' @ [74:36] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElementWithParent.<no name provided>[LocalVariableDescriptor]

'getArgumentName' @ [74:43] ==> @Nullable public open fun getArgumentName(): KtValueArgumentName? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'asName' @ [74:62] ==> public open val asName: Name defined in org.jetbrains.kotlin.psi.KtValueArgumentName[JavaPropertyDescriptor]

'asString' @ [74:70] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'convertElementWithParent' @ [75:25] ==> public open fun convertElementWithParent(element: PsiElement, requiredType: Class<out UElement>?): UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin[SimpleFunctionDescriptorImpl]

'parentUnwrapped' @ [75:50] ==> val parentUnwrapped: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElementWithParent.<no name provided>[LocalVariableDescriptor]

'attributeValues' @ [76:27] ==> public abstract val attributeValues: List<UNamedExpression> defined in org.jetbrains.uast.UAnnotation[DeserializedPropertyDescriptor]

'find' @ [76:44] ==> @InlineOnly public inline fun <T> Iterable<UNamedExpression>.find(predicate: (UNamedExpression) -> Boolean): UNamedExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UNamedExpression

'it' @ [76:51] ==> value-parameter it: UNamedExpression defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElementWithParent.<no name provided>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [76:54] ==> public abstract val name: String? defined in org.jetbrains.uast.UNamedExpression[DeserializedPropertyDescriptor]

'argumentName' @ [76:62] ==> val argumentName: String defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElementWithParent.<no name provided>[LocalVariableDescriptor]

'convertElementWithParent' @ [79:24] ==> public open fun convertElementWithParent(element: PsiElement, requiredType: Class<out UElement>?): UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin[SimpleFunctionDescriptorImpl]

'parentUnwrapped' @ [79:49] ==> val parentUnwrapped: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElementWithParent.<no name provided>[LocalVariableDescriptor]

'convertDeclaration' @ [81:16] ==> private final fun convertDeclaration(element: PsiElement, parentCallback: (() -> UElement?)?, requiredType: Class<out UElement>?): UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin[SimpleFunctionDescriptorImpl]

'element' @ [81:35] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElementWithParent[ValueParameterDescriptorImpl]

'parentCallback' @ [81:44] ==> val parentCallback: () -> UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElementWithParent[LocalVariableDescriptor]

'requiredType' @ [81:60] ==> value-parameter requiredType: Class<out UElement>? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElementWithParent[ValueParameterDescriptorImpl]

'KotlinConverter' @ [82:19] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'convertPsiElement' @ [82:35] ==> internal final fun convertPsiElement(element: PsiElement?, parentCallback: (() -> UElement?)?, requiredType: Class<out UElement>?): UElement? defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'element' @ [82:53] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElementWithParent[ValueParameterDescriptorImpl]

'parentCallback' @ [82:62] ==> val parentCallback: () -> UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElementWithParent[LocalVariableDescriptor]

'requiredType' @ [82:78] ==> value-parameter requiredType: Class<out UElement>? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertElementWithParent[ValueParameterDescriptorImpl]

'element' @ [90:13] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getMethodCallExpression[ValueParameterDescriptorImpl]

'element' @ [91:28] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getMethodCallExpression[ValueParameterDescriptorImpl]

'getResolvedCall' @ [91:36] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [91:52] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getMethodCallExpression[ValueParameterDescriptorImpl]

'analyze' @ [91:60] ==> internal fun KtElement.analyze(): BindingContext defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [92:35] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getMethodCallExpression[LocalVariableDescriptor]

'resultingDescriptor' @ [92:48] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'resultingDescriptor' @ [93:13] ==> val resultingDescriptor: CallableDescriptor defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getMethodCallExpression[LocalVariableDescriptor]

'resultingDescriptor' @ [93:59] ==> val resultingDescriptor: CallableDescriptor defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getMethodCallExpression[LocalVariableDescriptor]

'name' @ [93:79] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [93:84] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'methodName' @ [93:98] ==> value-parameter methodName: String defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getMethodCallExpression[ValueParameterDescriptorImpl]

'element' @ [95:22] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getMethodCallExpression[ValueParameterDescriptorImpl]

'parent' @ [95:30] ==> public final val KtCallExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'convertElementWithParent' @ [96:30] ==> public open fun convertElementWithParent(element: PsiElement, requiredType: Class<out UElement>?): UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin[SimpleFunctionDescriptorImpl]

'parent' @ [96:55] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getMethodCallExpression[LocalVariableDescriptor]

'KotlinUFunctionCallExpression' @ [98:27] ==> public constructor KotlinUFunctionCallExpression(psi: KtCallExpression, uastParent: UElement?, _resolvedCall: ResolvedCall<*>?) defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[ClassConstructorDescriptorImpl]

'element' @ [98:57] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getMethodCallExpression[ValueParameterDescriptorImpl]

'parentUElement' @ [98:66] ==> val parentUElement: UElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getMethodCallExpression[LocalVariableDescriptor]

'resolvedCall' @ [98:82] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getMethodCallExpression[LocalVariableDescriptor]

'uExpression' @ [99:22] ==> val uExpression: KotlinUFunctionCallExpression defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getMethodCallExpression[LocalVariableDescriptor]

'resolve' @ [99:34] ==> public open fun resolve(): PsiMethod? defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[SimpleFunctionDescriptorImpl]

'method' @ [100:13] ==> val method: PsiMethod defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getMethodCallExpression[LocalVariableDescriptor]

'name' @ [100:20] ==> public final var PsiMethod.name: String[MyPropertyDescriptor]

'methodName' @ [100:28] ==> value-parameter methodName: String defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getMethodCallExpression[ValueParameterDescriptorImpl]

'UastLanguagePlugin' @ [101:16] ==> public companion object defined in org.jetbrains.uast.UastLanguagePlugin[FakeCallableDescriptorForObject]

'ResolvedMethod' @ [101:35] ==> public constructor ResolvedMethod(call: UCallExpression, method: PsiMethod) defined in org.jetbrains.uast.UastLanguagePlugin.ResolvedMethod[DeserializedClassConstructorDescriptor]

'uExpression' @ [101:50] ==> val uExpression: KotlinUFunctionCallExpression defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getMethodCallExpression[LocalVariableDescriptor]

'method' @ [101:63] ==> val method: PsiMethod defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getMethodCallExpression[LocalVariableDescriptor]

'element' @ [108:13] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getConstructorCallExpression[ValueParameterDescriptorImpl]

'element' @ [109:28] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getConstructorCallExpression[ValueParameterDescriptorImpl]

'getResolvedCall' @ [109:36] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [109:52] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getConstructorCallExpression[ValueParameterDescriptorImpl]

'analyze' @ [109:60] ==> internal fun KtElement.analyze(): BindingContext defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [110:35] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getConstructorCallExpression[LocalVariableDescriptor]

'resultingDescriptor' @ [110:48] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'resultingDescriptor' @ [111:13] ==> val resultingDescriptor: CallableDescriptor defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getConstructorCallExpression[LocalVariableDescriptor]

'resultingDescriptor' @ [112:20] ==> val resultingDescriptor: CallableDescriptor defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getConstructorCallExpression[LocalVariableDescriptor]

'returnType' @ [112:40] ==> public final val ConstructorDescriptor.returnType: KotlinType[MyPropertyDescriptor]

'constructor' @ [112:51] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [112:63] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'name' @ [112:86] ==> public final val ClassifierDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [112:92] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'fqName' @ [112:106] ==> value-parameter fqName: String defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getConstructorCallExpression[ValueParameterDescriptorImpl]

'KotlinConverter' @ [116:22] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'unwrapElements' @ [116:38] ==> internal final tailrec fun unwrapElements(element: PsiElement?): PsiElement? defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'element' @ [116:53] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getConstructorCallExpression[ValueParameterDescriptorImpl]

'parent' @ [116:61] ==> public final val KtCallExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'convertElementWithParent' @ [117:30] ==> public open fun convertElementWithParent(element: PsiElement, requiredType: Class<out UElement>?): UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin[SimpleFunctionDescriptorImpl]

'parent' @ [117:55] ==> val parent: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getConstructorCallExpression[LocalVariableDescriptor]

'KotlinUFunctionCallExpression' @ [119:27] ==> public constructor KotlinUFunctionCallExpression(psi: KtCallExpression, uastParent: UElement?, _resolvedCall: ResolvedCall<*>?) defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[ClassConstructorDescriptorImpl]

'element' @ [119:57] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getConstructorCallExpression[ValueParameterDescriptorImpl]

'parentUElement' @ [119:66] ==> val parentUElement: UElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getConstructorCallExpression[LocalVariableDescriptor]

'resolvedCall' @ [119:82] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getConstructorCallExpression[LocalVariableDescriptor]

'uExpression' @ [120:22] ==> val uExpression: KotlinUFunctionCallExpression defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getConstructorCallExpression[LocalVariableDescriptor]

'resolve' @ [120:34] ==> public open fun resolve(): PsiMethod? defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[SimpleFunctionDescriptorImpl]

'method' @ [121:31] ==> val method: PsiMethod defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getConstructorCallExpression[LocalVariableDescriptor]

'containingClass' @ [121:38] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'UastLanguagePlugin' @ [122:16] ==> public companion object defined in org.jetbrains.uast.UastLanguagePlugin[FakeCallableDescriptorForObject]

'ResolvedConstructor' @ [122:35] ==> public constructor ResolvedConstructor(call: UCallExpression, constructor: PsiMethod, clazz: PsiClass) defined in org.jetbrains.uast.UastLanguagePlugin.ResolvedConstructor[DeserializedClassConstructorDescriptor]

'uExpression' @ [122:55] ==> val uExpression: KotlinUFunctionCallExpression defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getConstructorCallExpression[LocalVariableDescriptor]

'method' @ [122:68] ==> val method: PsiMethod defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getConstructorCallExpression[LocalVariableDescriptor]

'containingClass' @ [122:76] ==> val containingClass: PsiClass defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.getConstructorCallExpression[LocalVariableDescriptor]

'element' @ [128:13] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[ValueParameterDescriptorImpl]

'element' @ [128:41] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[ValueParameterDescriptorImpl]

'element' @ [130:13] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[ValueParameterDescriptorImpl]

'isValid' @ [130:21] ==> public final val PsiElement.isValid: Boolean[MyPropertyDescriptor]

'element' @ [130:30] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[ValueParameterDescriptorImpl]

'getUserData' @ [130:38] ==> @Nullable public abstract fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(WeakReference<UElement>..WeakReference<UElement>?)>): WeakReference<UElement>? defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> WeakReference<UElement>

'KOTLIN_CACHED_UELEMENT_KEY' @ [130:50] ==> internal val KOTLIN_CACHED_UELEMENT_KEY: Key<(WeakReference<UElement>..WeakReference<UElement>?)> defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[PropertyDescriptorImpl]

'let' @ [130:79] ==> @InlineOnly public inline fun <T, R> WeakReference<UElement>.let(block: (WeakReference<UElement>) -> Nothing?): Nothing? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WeakReference<UElement>
    <R> -> Nothing?

'ref' @ [131:13] ==> value-parameter ref: WeakReference<UElement> defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'get' @ [131:17] ==> public open fun get(): UElement? defined in java.lang.ref.WeakReference[JavaMethodDescriptor]

'let' @ [131:24] ==> @InlineOnly public inline fun <T, R> UElement.let(block: (UElement) -> Nothing?): Nothing? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UElement
    <R> -> Nothing?

'it' @ [131:37] ==> value-parameter it: UElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (parentCallback == null) null else (parentCallback() ?: return null)' @ [136:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UElement?, elseBranch: UElement?): UElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UElement?

'parentCallback' @ [136:34] ==> value-parameter parentCallback: (() -> UElement?)? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[ValueParameterDescriptorImpl]

'invoke' @ [136:69] ==> public abstract operator fun invoke(): UElement? defined in kotlin.Function0[FunctionInvokeDescriptor]

'invoke' @ [137:24] ==> public abstract operator fun invoke(p1: P, p2: UElement?): UElement defined in kotlin.Function2[FunctionInvokeDescriptor]

'element' @ [137:29] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[ValueParameterDescriptorImpl]

'parent' @ [137:43] ==> val parent: UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration.build.<no name provided>[LocalVariableDescriptor]

'element' @ [141:24] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[ValueParameterDescriptorImpl]

'originalElement' @ [141:32] ==> public final val PsiElement.originalElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'with' @ [142:16] ==> @InlineOnly public inline fun <T, R> with(receiver: Class<out UElement>?, block: Class<out UElement>?.() -> UElement?): UElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out UElement>?
    <R> -> UElement?

'requiredType' @ [142:21] ==> value-parameter requiredType: Class<out UElement>? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[ValueParameterDescriptorImpl]

'when (original) {
                is KtLightMethod -> el<UMethod>(build(KotlinUMethod.Companion::create))   // .Companion is needed because of KT-13934
                is KtLightClass -> el<UClass>(build(KotlinUClass.Companion::create))

                is KtLightFieldImpl.KtLightEnumConstant -> el<UEnumConstant>(build(::KotlinUEnumConstant))
                is KtLightField -> el<UField>(build(::KotlinUField))
                is KtLightParameter, is UastKotlinPsiParameter -> el<UParameter>(build(::KotlinUParameter))
                is UastKotlinPsiVariable -> el<UVariable>(build(::KotlinUVariable))

                is KtClassOrObject -> el<UClass> {
                    original.toLightClass()?.let { lightClass ->
                        val parent = if (parentCallback == null) null else (parentCallback() ?: return null)
                        KotlinUClass.create(lightClass, parent)
                    }
                }
                is KtFunction -> el<UMethod> {
                    val lightMethod = LightClassUtil.getLightClassMethod(original) ?: return null
                    convertDeclaration(lightMethod, parentCallback, requiredType)
                }
                is KtPropertyAccessor -> el<UMethod> {
                    val parent = if (parentCallback == null) null else (parentCallback() ?: return null)
                    javaPlugin.convertOpt<UMethod>(
                            LightClassUtil.getLightClassAccessorMethod(original), parent)
                }
                is KtProperty -> el<UField> {
                    val parent = if (parentCallback == null) null else (parentCallback() ?: return null)
                    javaPlugin.convertOpt<UField>(
                            LightClassUtil.getLightClassBackingField(original), parent)
                    ?: convertDeclaration(element.parent, parentCallback, requiredType)
                }

                is KtFile -> el<UFile> { KotlinUFile(original, this@KotlinUastLanguagePlugin) }
                is FakeFileForLightClass -> el<UFile> { KotlinUFile(original.navigationElement, this@KotlinUastLanguagePlugin) }
                is KtAnnotationEntry -> el<UAnnotation>(build(::KotlinUAnnotation))
                else -> null
            }' @ [143:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UElement?, entry1: UElement?, entry2: UElement?, entry3: UElement?, entry4: UElement?, entry5: UElement?, entry6: UElement?, entry7: UElement?, entry8: UElement?, entry9: UElement?, entry10: UElement?, entry11: UElement?, entry12: UElement?, entry13: UElement?): UElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UElement?

'original' @ [143:19] ==> val original: (PsiElement..PsiElement?) defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[LocalVariableDescriptor]

'el' @ [144:37] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.el(f: () -> UElement?): UElement? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UMethod

'build' @ [144:49] ==> local final fun <P : PsiElement> build(ctor: (KtLightMethod, UElement?) -> UElement): () -> UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtLightMethod

'KotlinUMethod' @ [144:55] ==> public companion object defined in org.jetbrains.uast.kotlin.declarations.KotlinUMethod[FakeCallableDescriptorForObject]

'Companion' @ [144:69] ==> public companion object defined in org.jetbrains.uast.kotlin.declarations.KotlinUMethod[FakeCallableDescriptorForObject]

'el' @ [145:36] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.el(f: () -> UElement?): UElement? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UClass

'build' @ [145:47] ==> local final fun <P : PsiElement> build(ctor: (KtLightClass, UElement?) -> UElement): () -> UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtLightClass

'KotlinUClass' @ [145:53] ==> public companion object defined in org.jetbrains.uast.kotlin.KotlinUClass[FakeCallableDescriptorForObject]

'Companion' @ [145:66] ==> public companion object defined in org.jetbrains.uast.kotlin.KotlinUClass[FakeCallableDescriptorForObject]

'el' @ [147:60] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.el(f: () -> UElement?): UElement? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UEnumConstant

'build' @ [147:78] ==> local final fun <P : PsiElement> build(ctor: (PsiEnumConstant, UElement?) -> UElement): () -> UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> PsiEnumConstant

'el' @ [148:36] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.el(f: () -> UElement?): UElement? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UField

'build' @ [148:47] ==> local final fun <P : PsiElement> build(ctor: (PsiField, UElement?) -> UElement): () -> UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> PsiField

'el' @ [149:67] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.el(f: () -> UElement?): UElement? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UParameter

'build' @ [149:82] ==> local final fun <P : PsiElement> build(ctor: (PsiParameter, UElement?) -> UElement): () -> UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> PsiParameter

'el' @ [150:45] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.el(f: () -> UElement?): UElement? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UVariable

'build' @ [150:59] ==> local final fun <P : PsiElement> build(ctor: (PsiVariable, UElement?) -> UElement): () -> UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> PsiVariable

'el' @ [152:39] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.el(f: () -> UElement?): UElement? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UClass

'original' @ [153:21] ==> val original: (PsiElement..PsiElement?) defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[LocalVariableDescriptor]

'toLightClass' @ [153:30] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'let' @ [153:46] ==> @InlineOnly public inline fun <T, R> KtLightClass.let(block: (KtLightClass) -> UClass): UClass defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLightClass
    <R> -> UClass

'if (parentCallback == null) null else (parentCallback() ?: return null)' @ [154:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UElement?, elseBranch: UElement?): UElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UElement?

'parentCallback' @ [154:42] ==> value-parameter parentCallback: (() -> UElement?)? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[ValueParameterDescriptorImpl]

'invoke' @ [154:77] ==> public abstract operator fun invoke(): UElement? defined in kotlin.Function0[FunctionInvokeDescriptor]

'KotlinUClass' @ [155:25] ==> public companion object defined in org.jetbrains.uast.kotlin.KotlinUClass[FakeCallableDescriptorForObject]

'create' @ [155:38] ==> public final fun create(psi: KtLightClass, containingElement: UElement?): UClass defined in org.jetbrains.uast.kotlin.KotlinUClass.Companion[SimpleFunctionDescriptorImpl]

'lightClass' @ [155:45] ==> value-parameter lightClass: KtLightClass defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [155:57] ==> val parent: UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'el' @ [158:34] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.el(f: () -> UElement?): UElement? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UMethod

'LightClassUtil' @ [159:39] ==> public object LightClassUtil defined in org.jetbrains.kotlin.asJava[FakeCallableDescriptorForObject]

'getLightClassMethod' @ [159:54] ==> public final fun getLightClassMethod(function: KtFunction): PsiMethod? defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'original' @ [159:74] ==> val original: (PsiElement..PsiElement?) defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[LocalVariableDescriptor]

'convertDeclaration' @ [160:21] ==> private final fun convertDeclaration(element: PsiElement, parentCallback: (() -> UElement?)?, requiredType: Class<out UElement>?): UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin[SimpleFunctionDescriptorImpl]

'lightMethod' @ [160:40] ==> val lightMethod: PsiMethod defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration.<anonymous>.<anonymous>[LocalVariableDescriptor]

'parentCallback' @ [160:53] ==> value-parameter parentCallback: (() -> UElement?)? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[ValueParameterDescriptorImpl]

'requiredType' @ [160:69] ==> value-parameter requiredType: Class<out UElement>? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[ValueParameterDescriptorImpl]

'el' @ [162:42] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.el(f: () -> UElement?): UElement? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UMethod

'if (parentCallback == null) null else (parentCallback() ?: return null)' @ [163:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UElement?, elseBranch: UElement?): UElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UElement?

'parentCallback' @ [163:38] ==> value-parameter parentCallback: (() -> UElement?)? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[ValueParameterDescriptorImpl]

'invoke' @ [163:73] ==> public abstract operator fun invoke(): UElement? defined in kotlin.Function0[FunctionInvokeDescriptor]

'javaPlugin' @ [164:21] ==> private final val javaPlugin: UastLanguagePlugin defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin[PropertyDescriptorImpl]

'convertOpt' @ [164:32] ==> public inline fun <reified T : UElement> UastLanguagePlugin.convertOpt(element: PsiElement?, parent: UElement?): UMethod? defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : UElement> -> UMethod

'LightClassUtil' @ [165:29] ==> public object LightClassUtil defined in org.jetbrains.kotlin.asJava[FakeCallableDescriptorForObject]

'getLightClassAccessorMethod' @ [165:44] ==> public final fun getLightClassAccessorMethod(accessor: KtPropertyAccessor): PsiMethod? defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'original' @ [165:72] ==> val original: (PsiElement..PsiElement?) defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[LocalVariableDescriptor]

'parent' @ [165:83] ==> val parent: UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration.<anonymous>.<anonymous>[LocalVariableDescriptor]

'el' @ [167:34] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.el(f: () -> UElement?): UElement? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UField

'if (parentCallback == null) null else (parentCallback() ?: return null)' @ [168:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UElement?, elseBranch: UElement?): UElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UElement?

'parentCallback' @ [168:38] ==> value-parameter parentCallback: (() -> UElement?)? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[ValueParameterDescriptorImpl]

'invoke' @ [168:73] ==> public abstract operator fun invoke(): UElement? defined in kotlin.Function0[FunctionInvokeDescriptor]

'javaPlugin' @ [169:21] ==> private final val javaPlugin: UastLanguagePlugin defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin[PropertyDescriptorImpl]

'convertOpt' @ [169:32] ==> public inline fun <reified T : UElement> UastLanguagePlugin.convertOpt(element: PsiElement?, parent: UElement?): UField? defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : UElement> -> UField

'LightClassUtil' @ [170:29] ==> public object LightClassUtil defined in org.jetbrains.kotlin.asJava[FakeCallableDescriptorForObject]

'getLightClassBackingField' @ [170:44] ==> public final fun getLightClassBackingField(declaration: KtDeclaration): PsiField? defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'original' @ [170:70] ==> val original: (PsiElement..PsiElement?) defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[LocalVariableDescriptor]

'parent' @ [170:81] ==> val parent: UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration.<anonymous>.<anonymous>[LocalVariableDescriptor]

'convertDeclaration' @ [171:24] ==> private final fun convertDeclaration(element: PsiElement, parentCallback: (() -> UElement?)?, requiredType: Class<out UElement>?): UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin[SimpleFunctionDescriptorImpl]

'element' @ [171:43] ==> value-parameter element: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[ValueParameterDescriptorImpl]

'parent' @ [171:51] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parentCallback' @ [171:59] ==> value-parameter parentCallback: (() -> UElement?)? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[ValueParameterDescriptorImpl]

'requiredType' @ [171:75] ==> value-parameter requiredType: Class<out UElement>? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[ValueParameterDescriptorImpl]

'el' @ [174:30] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.el(f: () -> UElement?): UElement? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UFile

'KotlinUFile' @ [174:42] ==> public constructor KotlinUFile(psi: KtFile, languagePlugin: UastLanguagePlugin) defined in org.jetbrains.uast.kotlin.KotlinUFile[ClassConstructorDescriptorImpl]

'original' @ [174:54] ==> val original: (PsiElement..PsiElement?) defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[LocalVariableDescriptor]

'this@KotlinUastLanguagePlugin' @ [174:64] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin[LazyClassReceiverParameterDescriptor]

'el' @ [175:45] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.el(f: () -> UElement?): UElement? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UFile

'KotlinUFile' @ [175:57] ==> public constructor KotlinUFile(psi: KtFile, languagePlugin: UastLanguagePlugin) defined in org.jetbrains.uast.kotlin.KotlinUFile[ClassConstructorDescriptorImpl]

'original' @ [175:69] ==> val original: (PsiElement..PsiElement?) defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[LocalVariableDescriptor]

'navigationElement' @ [175:78] ==> public final val FakeFileForLightClass.navigationElement: KtFile[MyPropertyDescriptor]

'this@KotlinUastLanguagePlugin' @ [175:97] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin[LazyClassReceiverParameterDescriptor]

'el' @ [176:41] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.el(f: () -> UElement?): UElement? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UAnnotation

'build' @ [176:57] ==> local final fun <P : PsiElement> build(ctor: (KtAnnotationEntry, UElement?) -> UElement): () -> UElement? defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.convertDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtAnnotationEntry

'when (element) {
            is KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression -> element.setterValue != null
            is KotlinAbstractUExpression -> {
                val ktElement = element.psi as? KtElement ?: return false
                ktElement.analyze()[BindingContext.USED_AS_EXPRESSION, ktElement] ?: false
            }
            else -> false
        }' @ [183:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'element' @ [183:22] ==> value-parameter element: UExpression defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.isExpressionValueUsed[ValueParameterDescriptorImpl]

'element' @ [184:81] ==> value-parameter element: UExpression defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.isExpressionValueUsed[ValueParameterDescriptorImpl]

'setterValue' @ [184:89] ==> public final val setterValue: KtExpression? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[PropertyDescriptorImpl]

'element' @ [186:33] ==> value-parameter element: UExpression defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.isExpressionValueUsed[ValueParameterDescriptorImpl]

'psi' @ [186:41] ==> public abstract val psi: PsiElement? defined in org.jetbrains.uast.UExpression[DeserializedPropertyDescriptor]

'ktElement' @ [187:17] ==> val ktElement: KtElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.isExpressionValueUsed[LocalVariableDescriptor]

'analyze' @ [187:27] ==> internal fun KtElement.analyze(): BindingContext defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'USED_AS_EXPRESSION' @ [187:52] ==> public final val USED_AS_EXPRESSION: (WritableSlice<(KtElement..KtElement?), (Boolean..Boolean?)>..WritableSlice<(KtElement..KtElement?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktElement' @ [187:72] ==> val ktElement: KtElement defined in org.jetbrains.uast.kotlin.KotlinUastLanguagePlugin.isExpressionValueUsed[LocalVariableDescriptor]

'if (this == null || isAssignableFrom(ActualT::class.java)) f() else null' @ [195:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UElement?, elseBranch: UElement?): UElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UElement?

'this' @ [195:16] ==> <this> defined in org.jetbrains.uast.kotlin.el[ReceiverParameterDescriptorImpl]

'isAssignableFrom' @ [195:32] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'java' @ [195:64] ==> public val <T> KClass<ActualT>.java: Class<ActualT> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ActualT

'invoke' @ [195:71] ==> public abstract operator fun invoke(): UElement? defined in kotlin.Function0[FunctionInvokeDescriptor]

'if (this == null || isAssignableFrom(ActualT::class.java)) f() else null' @ [199:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UExpression?, elseBranch: UExpression?): UExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UExpression?

'this' @ [199:16] ==> <this> defined in org.jetbrains.uast.kotlin.expr[ReceiverParameterDescriptorImpl]

'isAssignableFrom' @ [199:32] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'java' @ [199:64] ==> public val <T> KClass<ActualT>.java: Class<ActualT> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ActualT

'invoke' @ [199:71] ==> public abstract operator fun invoke(): UExpression? defined in kotlin.Function0[FunctionInvokeDescriptor]

'if (this != null) fun(): UElement? { return this } else null' @ [202:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (() -> UElement?)?, elseBranch: (() -> UElement?)?): (() -> UElement?)?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Function0<UElement?>?

'this' @ [202:43] ==> <this> defined in org.jetbrains.uast.kotlin.toCallback[ReceiverParameterDescriptorImpl]

'this' @ [202:83] ==> <this> defined in org.jetbrains.uast.kotlin.toCallback[ReceiverParameterDescriptorImpl]

'when (element) {
        is KtValueArgumentList -> unwrapElements(element.parent)
        is KtValueArgument -> unwrapElements(element.parent)
        is KtDeclarationModifierList -> unwrapElements(element.parent)
        else -> element
    }' @ [205:78] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?, entry3: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'element' @ [205:84] ==> value-parameter element: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.unwrapElements[ValueParameterDescriptorImpl]

'unwrapElements' @ [206:35] ==> internal final tailrec fun unwrapElements(element: PsiElement?): PsiElement? defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'element' @ [206:50] ==> value-parameter element: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.unwrapElements[ValueParameterDescriptorImpl]

'parent' @ [206:58] ==> public final val KtValueArgumentList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'unwrapElements' @ [207:31] ==> internal final tailrec fun unwrapElements(element: PsiElement?): PsiElement? defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'element' @ [207:46] ==> value-parameter element: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.unwrapElements[ValueParameterDescriptorImpl]

'parent' @ [207:54] ==> public final val KtValueArgument.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'unwrapElements' @ [208:41] ==> internal final tailrec fun unwrapElements(element: PsiElement?): PsiElement? defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'element' @ [208:56] ==> value-parameter element: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.unwrapElements[ValueParameterDescriptorImpl]

'parent' @ [208:64] ==> public final val KtDeclarationModifierList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [209:17] ==> value-parameter element: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.unwrapElements[ValueParameterDescriptorImpl]

'if (parentCallback == null) null else (parentCallback() ?: return null)' @ [217:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UElement?, elseBranch: UElement?): UElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UElement?

'parentCallback' @ [217:34] ==> value-parameter parentCallback: (() -> UElement?)? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[ValueParameterDescriptorImpl]

'invoke' @ [217:69] ==> public abstract operator fun invoke(): UElement? defined in kotlin.Function0[FunctionInvokeDescriptor]

'invoke' @ [218:24] ==> public abstract operator fun invoke(p1: P, p2: UElement?): UElement defined in kotlin.Function2[FunctionInvokeDescriptor]

'element' @ [218:29] ==> value-parameter element: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[ValueParameterDescriptorImpl]

'parent' @ [218:43] ==> val parent: UElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement.build.<no name provided>[LocalVariableDescriptor]

'with' @ [222:16] ==> @InlineOnly public inline fun <T, R> with(receiver: Class<out UElement>?, block: Class<out UElement>?.() -> UElement?): UElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out UElement>?
    <R> -> UElement?

'requiredType' @ [222:22] ==> value-parameter requiredType: Class<out UElement>? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[ValueParameterDescriptorImpl]

'when (element) {
            is KtParameterList -> el<UDeclarationsExpression> {
                val parent = if (parentCallback == null) null else (parentCallback() ?: return null)
                KotlinUDeclarationsExpression(parent).apply {
                    declarations = element.parameters.mapIndexed { i, p ->
                        KotlinUParameter(UastKotlinPsiParameter.create(p, element, parent!!, i), this)
                    }
                }
            }
            is KtClassBody -> el<UExpressionList>(build(KotlinUExpressionList.Companion::createClassBody))
            is KtCatchClause -> el<UCatchClause>(build(::KotlinUCatchClause))
            is KtExpression -> KotlinConverter.convertExpression(element, parentCallback, requiredType)
            is KtLambdaArgument -> KotlinConverter.convertExpression(element.getLambdaExpression(), parentCallback, requiredType)
            is KtContainerNode -> element.getExpression()?.let {
                KotlinConverter.convertExpression(it, parentCallback, requiredType)
            } ?: el<UExpression> { UastEmptyExpression }
            is KtLightAnnotationForSourceEntry.LightExpressionValue<*> -> {
                val expression = element.originalExpression
                when (expression) {
                    is KtExpression -> KotlinConverter.convertExpression(expression, parentCallback, requiredType)
                    else -> el<UExpression> { UastEmptyExpression }
                }
            }
            is KtLiteralStringTemplateEntry, is KtEscapeStringTemplateEntry -> el<ULiteralExpression>(build(::KotlinStringULiteralExpression))
            is KtStringTemplateEntry -> element.expression?.let { convertExpression(it, parentCallback, requiredType) } ?: expr<UExpression> { UastEmptyExpression }

            else -> {
                if (element is LeafPsiElement && element.elementType == KtTokens.IDENTIFIER) {
                    el<UIdentifier>(build(::UIdentifier))
                } else {
                    null
                }
            }
        }' @ [222:38] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UElement?, entry1: UElement?, entry2: UElement?, entry3: UElement?, entry4: UElement?, entry5: UElement?, entry6: UElement?, entry7: UElement?, entry8: UElement?, entry9: UElement?): UElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UElement?

'element' @ [222:44] ==> value-parameter element: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[ValueParameterDescriptorImpl]

'el' @ [223:35] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.el(f: () -> UElement?): UElement? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UDeclarationsExpression

'if (parentCallback == null) null else (parentCallback() ?: return null)' @ [224:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UElement?, elseBranch: UElement?): UElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UElement?

'parentCallback' @ [224:34] ==> value-parameter parentCallback: (() -> UElement?)? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[ValueParameterDescriptorImpl]

'invoke' @ [224:69] ==> public abstract operator fun invoke(): UElement? defined in kotlin.Function0[FunctionInvokeDescriptor]

'KotlinUDeclarationsExpression' @ [225:17] ==> public constructor KotlinUDeclarationsExpression(uastParent: UElement?) defined in org.jetbrains.uast.KotlinUDeclarationsExpression[ClassConstructorDescriptorImpl]

'parent' @ [225:47] ==> val parent: UElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement.<anonymous>.<anonymous>[LocalVariableDescriptor]

'apply' @ [225:55] ==> @InlineOnly public inline fun <T> KotlinUDeclarationsExpression.apply(block: KotlinUDeclarationsExpression.() -> Unit): KotlinUDeclarationsExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinUDeclarationsExpression

'declarations' @ [226:21] ==> public open lateinit var declarations: List<UDeclaration> defined in org.jetbrains.uast.KotlinUDeclarationsExpression[PropertyDescriptorImpl]

'element' @ [226:36] ==> value-parameter element: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[ValueParameterDescriptorImpl]

'parameters' @ [226:44] ==> public final val KtParameterList.parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'mapIndexed' @ [226:55] ==> public inline fun <T, R> Iterable<(KtParameter..KtParameter?)>.mapIndexed(transform: (index: Int, (KtParameter..KtParameter?)) -> KotlinUParameter): List<KotlinUParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)
    <R> -> KotlinUParameter

'KotlinUParameter' @ [227:25] ==> public constructor KotlinUParameter(psi: PsiParameter, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinUParameter[ClassConstructorDescriptorImpl]

'UastKotlinPsiParameter' @ [227:42] ==> public companion object defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiParameter[FakeCallableDescriptorForObject]

'create' @ [227:65] ==> public final fun create(parameter: KtParameter, parent: PsiElement, containingElement: UElement, index: Int): PsiParameter defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiParameter.Companion[SimpleFunctionDescriptorImpl]

'p' @ [227:72] ==> value-parameter p: (KtParameter..KtParameter?) defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [227:75] ==> value-parameter element: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[ValueParameterDescriptorImpl]

'parent' @ [227:84] ==> val parent: UElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement.<anonymous>.<anonymous>[LocalVariableDescriptor]

'i' @ [227:94] ==> value-parameter i: Int defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [227:98] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'el' @ [231:31] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.el(f: () -> UElement?): UElement? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UExpressionList

'build' @ [231:51] ==> local final fun <P : PsiElement> build(ctor: (PsiElement, UElement?) -> UElement): () -> UElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> PsiElement

'KotlinUExpressionList' @ [231:57] ==> public companion object defined in org.jetbrains.uast.kotlin.KotlinUExpressionList[FakeCallableDescriptorForObject]

'Companion' @ [231:79] ==> public companion object defined in org.jetbrains.uast.kotlin.KotlinUExpressionList[FakeCallableDescriptorForObject]

'el' @ [232:33] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.el(f: () -> UElement?): UElement? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UCatchClause

'build' @ [232:50] ==> local final fun <P : PsiElement> build(ctor: (KtCatchClause, UElement?) -> UElement): () -> UElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtCatchClause

'KotlinConverter' @ [233:32] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'convertExpression' @ [233:48] ==> internal final fun convertExpression(expression: KtExpression, parentCallback: (() -> UElement?)?, requiredType: Class<out UElement>? = ...): UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'element' @ [233:66] ==> value-parameter element: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[ValueParameterDescriptorImpl]

'parentCallback' @ [233:75] ==> value-parameter parentCallback: (() -> UElement?)? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[ValueParameterDescriptorImpl]

'requiredType' @ [233:91] ==> value-parameter requiredType: Class<out UElement>? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[ValueParameterDescriptorImpl]

'KotlinConverter' @ [234:36] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'convertExpression' @ [234:52] ==> internal final fun convertExpression(expression: KtExpression, parentCallback: (() -> UElement?)?, requiredType: Class<out UElement>? = ...): UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'element' @ [234:70] ==> value-parameter element: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[ValueParameterDescriptorImpl]

'getLambdaExpression' @ [234:78] ==> public open fun getLambdaExpression(): KtLambdaExpression defined in org.jetbrains.kotlin.psi.KtLambdaArgument[DeserializedSimpleFunctionDescriptor]

'parentCallback' @ [234:101] ==> value-parameter parentCallback: (() -> UElement?)? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[ValueParameterDescriptorImpl]

'requiredType' @ [234:117] ==> value-parameter requiredType: Class<out UElement>? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[ValueParameterDescriptorImpl]

'element' @ [235:35] ==> value-parameter element: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[ValueParameterDescriptorImpl]

'getExpression' @ [235:43] ==> internal final fun KtContainerNode.getExpression(): KtExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'let' @ [235:60] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> UExpression?): UExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> UExpression?

'KotlinConverter' @ [236:17] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'convertExpression' @ [236:33] ==> internal final fun convertExpression(expression: KtExpression, parentCallback: (() -> UElement?)?, requiredType: Class<out UElement>? = ...): UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'it' @ [236:51] ==> value-parameter it: KtExpression defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parentCallback' @ [236:55] ==> value-parameter parentCallback: (() -> UElement?)? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[ValueParameterDescriptorImpl]

'requiredType' @ [236:71] ==> value-parameter requiredType: Class<out UElement>? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[ValueParameterDescriptorImpl]

'el' @ [237:18] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.el(f: () -> UElement?): UElement? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UExpression

'UastEmptyExpression' @ [237:36] ==> public object UastEmptyExpression : UExpression defined in org.jetbrains.uast[FakeCallableDescriptorForObject]

'element' @ [239:34] ==> value-parameter element: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[ValueParameterDescriptorImpl]

'originalExpression' @ [239:42] ==> public final val originalExpression: PsiElement? defined in org.jetbrains.kotlin.asJava.elements.KtLightAnnotationForSourceEntry.LightExpressionValue[DeserializedPropertyDescriptor]

'when (expression) {
                    is KtExpression -> KotlinConverter.convertExpression(expression, parentCallback, requiredType)
                    else -> el<UExpression> { UastEmptyExpression }
                }' @ [240:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UElement?, entry1: UElement?): UElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UElement?

'expression' @ [240:23] ==> val expression: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement.<anonymous>[LocalVariableDescriptor]

'KotlinConverter' @ [241:40] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'convertExpression' @ [241:56] ==> internal final fun convertExpression(expression: KtExpression, parentCallback: (() -> UElement?)?, requiredType: Class<out UElement>? = ...): UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'expression' @ [241:74] ==> val expression: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement.<anonymous>[LocalVariableDescriptor]

'parentCallback' @ [241:86] ==> value-parameter parentCallback: (() -> UElement?)? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[ValueParameterDescriptorImpl]

'requiredType' @ [241:102] ==> value-parameter requiredType: Class<out UElement>? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[ValueParameterDescriptorImpl]

'el' @ [242:29] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.el(f: () -> UElement?): UElement? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UExpression

'UastEmptyExpression' @ [242:47] ==> public object UastEmptyExpression : UExpression defined in org.jetbrains.uast[FakeCallableDescriptorForObject]

'el' @ [245:80] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.el(f: () -> UElement?): UElement? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> ULiteralExpression

'build' @ [245:103] ==> local final fun <P : PsiElement> build(ctor: (PsiElement, UElement?) -> UElement): () -> UElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> PsiElement

'element' @ [246:41] ==> value-parameter element: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[ValueParameterDescriptorImpl]

'expression' @ [246:49] ==> public final val KtStringTemplateEntry.expression: KtExpression?[MyPropertyDescriptor]

'let' @ [246:61] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> UExpression?): UExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> UExpression?

'convertExpression' @ [246:67] ==> internal final fun convertExpression(expression: KtExpression, parentCallback: (() -> UElement?)?, requiredType: Class<out UElement>? = ...): UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'it' @ [246:85] ==> value-parameter it: KtExpression defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parentCallback' @ [246:89] ==> value-parameter parentCallback: (() -> UElement?)? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[ValueParameterDescriptorImpl]

'requiredType' @ [246:105] ==> value-parameter requiredType: Class<out UElement>? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[ValueParameterDescriptorImpl]

'expr' @ [246:124] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UExpression

'UastEmptyExpression' @ [246:144] ==> public object UastEmptyExpression : UExpression defined in org.jetbrains.uast[FakeCallableDescriptorForObject]

'if (element is LeafPsiElement && element.elementType == KtTokens.IDENTIFIER) {
                    el<UIdentifier>(build(::UIdentifier))
                } else {
                    null
                }' @ [249:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UElement?, elseBranch: UElement?): UElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UElement?

'element' @ [249:21] ==> value-parameter element: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[ValueParameterDescriptorImpl]

'element' @ [249:50] ==> value-parameter element: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[ValueParameterDescriptorImpl]

'elementType' @ [249:58] ==> public final val LeafPsiElement.elementType: IElementType[MyPropertyDescriptor]

'IDENTIFIER' @ [249:82] ==> public final val IDENTIFIER: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'el' @ [250:21] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.el(f: () -> UElement?): UElement? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UIdentifier

'build' @ [250:37] ==> local final fun <P : PsiElement> build(ctor: (PsiElement, UElement?) -> UElement): () -> UElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertPsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> PsiElement

'with' @ [262:16] ==> @InlineOnly public inline fun <T, R> with(receiver: Class<out UElement>?, block: Class<out UElement>?.() -> UExpression?): UExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out UElement>?
    <R> -> UExpression?

'requiredType' @ [262:21] ==> value-parameter requiredType: Class<out UElement>? = ... defined in org.jetbrains.uast.kotlin.KotlinConverter.convertEntry[ValueParameterDescriptorImpl]

'if (entry is KtStringTemplateEntryWithExpression) {
                expr<UExpression> {
                    val parent = if (parentCallback == null) null else (parentCallback() ?: return null)
                    KotlinConverter.convertOrEmpty(entry.expression, parent)
                }
            }
            else {
                expr<ULiteralExpression> {
                    val parent = if (parentCallback == null) null else (parentCallback() ?: return null)
                    if (entry is KtEscapeStringTemplateEntry)
                        KotlinStringULiteralExpression(entry, parent, entry.unescapedValue)
                    else
                        KotlinStringULiteralExpression(entry, parent)
                }
            }' @ [263:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UExpression?, elseBranch: UExpression?): UExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UExpression?

'entry' @ [263:17] ==> value-parameter entry: KtStringTemplateEntry defined in org.jetbrains.uast.kotlin.KotlinConverter.convertEntry[ValueParameterDescriptorImpl]

'expr' @ [264:17] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UExpression

'if (parentCallback == null) null else (parentCallback() ?: return null)' @ [265:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UElement?, elseBranch: UElement?): UElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UElement?

'parentCallback' @ [265:38] ==> value-parameter parentCallback: (() -> UElement?)? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertEntry[ValueParameterDescriptorImpl]

'invoke' @ [265:73] ==> public abstract operator fun invoke(): UElement? defined in kotlin.Function0[FunctionInvokeDescriptor]

'KotlinConverter' @ [266:21] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'convertOrEmpty' @ [266:37] ==> internal final fun convertOrEmpty(expression: KtExpression?, parent: UElement?): UExpression defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'entry' @ [266:52] ==> value-parameter entry: KtStringTemplateEntry defined in org.jetbrains.uast.kotlin.KotlinConverter.convertEntry[ValueParameterDescriptorImpl]

'expression' @ [266:58] ==> public final val KtStringTemplateEntryWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'parent' @ [266:70] ==> val parent: UElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertEntry.<anonymous>.<anonymous>[LocalVariableDescriptor]

'expr' @ [270:17] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> ULiteralExpression

'if (parentCallback == null) null else (parentCallback() ?: return null)' @ [271:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UElement?, elseBranch: UElement?): UElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UElement?

'parentCallback' @ [271:38] ==> value-parameter parentCallback: (() -> UElement?)? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertEntry[ValueParameterDescriptorImpl]

'invoke' @ [271:73] ==> public abstract operator fun invoke(): UElement? defined in kotlin.Function0[FunctionInvokeDescriptor]

'if (entry is KtEscapeStringTemplateEntry)
                        KotlinStringULiteralExpression(entry, parent, entry.unescapedValue)
                    else
                        KotlinStringULiteralExpression(entry, parent)' @ [272:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UExpression?, elseBranch: UExpression?): UExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UExpression?

'entry' @ [272:25] ==> value-parameter entry: KtStringTemplateEntry defined in org.jetbrains.uast.kotlin.KotlinConverter.convertEntry[ValueParameterDescriptorImpl]

'KotlinStringULiteralExpression' @ [273:25] ==> public constructor KotlinStringULiteralExpression(psi: PsiElement, uastParent: UElement?, text: String) defined in org.jetbrains.uast.kotlin.KotlinStringULiteralExpression[ClassConstructorDescriptorImpl]

'entry' @ [273:56] ==> value-parameter entry: KtStringTemplateEntry defined in org.jetbrains.uast.kotlin.KotlinConverter.convertEntry[ValueParameterDescriptorImpl]

'parent' @ [273:63] ==> val parent: UElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertEntry.<anonymous>.<anonymous>[LocalVariableDescriptor]

'entry' @ [273:71] ==> value-parameter entry: KtStringTemplateEntry defined in org.jetbrains.uast.kotlin.KotlinConverter.convertEntry[ValueParameterDescriptorImpl]

'unescapedValue' @ [273:77] ==> public final val KtEscapeStringTemplateEntry.unescapedValue: (String..String?)[MyPropertyDescriptor]

'KotlinStringULiteralExpression' @ [275:25] ==> public constructor KotlinStringULiteralExpression(psi: PsiElement, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinStringULiteralExpression[ClassConstructorDescriptorImpl]

'entry' @ [275:56] ==> value-parameter entry: KtStringTemplateEntry defined in org.jetbrains.uast.kotlin.KotlinConverter.convertEntry[ValueParameterDescriptorImpl]

'parent' @ [275:63] ==> val parent: UElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertEntry.<anonymous>.<anonymous>[LocalVariableDescriptor]

'if (parentCallback == null) null else (parentCallback() ?: return null)' @ [286:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UElement?, elseBranch: UElement?): UElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UElement?

'parentCallback' @ [286:34] ==> value-parameter parentCallback: (() -> UElement?)? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[ValueParameterDescriptorImpl]

'invoke' @ [286:69] ==> public abstract operator fun invoke(): UElement? defined in kotlin.Function0[FunctionInvokeDescriptor]

'invoke' @ [287:24] ==> public abstract operator fun invoke(p1: P, p2: UElement?): UExpression defined in kotlin.Function2[FunctionInvokeDescriptor]

'expression' @ [287:29] ==> value-parameter expression: KtExpression defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[ValueParameterDescriptorImpl]

'parent' @ [287:46] ==> val parent: UElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression.build.<no name provided>[LocalVariableDescriptor]

'with' @ [291:16] ==> @InlineOnly public inline fun <T, R> with(receiver: Class<out UElement>?, block: Class<out UElement>?.() -> UExpression?): UExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out UElement>?
    <R> -> UExpression?

'requiredType' @ [291:22] ==> value-parameter requiredType: Class<out UElement>? = ... defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[ValueParameterDescriptorImpl]

'when (expression) {
            is KtVariableDeclaration -> expr<UDeclarationsExpression>(build(::convertVariablesDeclaration))

            is KtStringTemplateExpression -> {
                when {
                    expression.entries.isEmpty() -> {
                        val parent = if (parentCallback == null) null else (parentCallback() ?: return null)
                        expr<ULiteralExpression> { KotlinStringULiteralExpression(expression, parent, "") }
                    }
                    expression.entries.size == 1 -> convertEntry(expression.entries[0], parentCallback, requiredType)
                    else -> {
                        val parent = if (parentCallback == null) null else (parentCallback() ?: return null)
                        expr<UExpression> { KotlinStringTemplateUPolyadicExpression(expression, parent) }
                    }
                }
            }
            is KtDestructuringDeclaration -> expr<UDeclarationsExpression> {
                val parent = if (parentCallback == null) null else (parentCallback() ?: return null)
                KotlinUDeclarationsExpression(parent).apply {
                    val tempAssignment = KotlinULocalVariable(UastKotlinPsiVariable.create(expression, parent!!), parent)
                    val destructuringAssignments = expression.entries.mapIndexed { i, entry ->
                        val psiFactory = KtPsiFactory(expression.project)
                        val initializer = psiFactory.createAnalyzableExpression("${tempAssignment.name}.component${i + 1}()",
                                                                                expression.containingFile)
                        KotlinULocalVariable(UastKotlinPsiVariable.create(entry, tempAssignment.psi, parent, initializer), parent)
                    }
                    declarations = listOf(tempAssignment) + destructuringAssignments
                }
            }
            is KtLabeledExpression -> expr<ULabeledExpression>(build(::KotlinULabeledExpression))
            is KtClassLiteralExpression -> expr<UClassLiteralExpression>(build(::KotlinUClassLiteralExpression))
            is KtObjectLiteralExpression -> expr<UObjectLiteralExpression>(build(::KotlinUObjectLiteralExpression))
            is KtDotQualifiedExpression -> expr<UQualifiedReferenceExpression>(build(::KotlinUQualifiedReferenceExpression))
            is KtSafeQualifiedExpression -> expr<UQualifiedReferenceExpression>(build(::KotlinUSafeQualifiedExpression))
            is KtSimpleNameExpression -> expr<USimpleNameReferenceExpression>(build(::KotlinUSimpleReferenceExpression))
            is KtCallExpression -> expr<UCallExpression>(build(::KotlinUFunctionCallExpression))
            is KtBinaryExpression -> {
                if (expression.operationToken == KtTokens.ELVIS) {
                    expr<UExpressionList>(build(::createElvisExpression))
                }
                else expr<UBinaryExpression>(build(::KotlinUBinaryExpression))
            }
            is KtParenthesizedExpression -> expr<UParenthesizedExpression>(build(::KotlinUParenthesizedExpression))
            is KtPrefixExpression -> expr<UPrefixExpression>(build(::KotlinUPrefixExpression))
            is KtPostfixExpression -> expr<UPostfixExpression>(build(::KotlinUPostfixExpression))
            is KtThisExpression -> expr<UThisExpression>(build(::KotlinUThisExpression))
            is KtSuperExpression -> expr<USuperExpression>(build(::KotlinUSuperExpression))
            is KtCallableReferenceExpression -> expr<UCallableReferenceExpression>(build(::KotlinUCallableReferenceExpression))
            is KtIsExpression -> expr<UBinaryExpressionWithType>(build(::KotlinUTypeCheckExpression))
            is KtIfExpression -> expr<UIfExpression>(build(::KotlinUIfExpression))
            is KtWhileExpression -> expr<UWhileExpression>(build(::KotlinUWhileExpression))
            is KtDoWhileExpression -> expr<UDoWhileExpression>(build(::KotlinUDoWhileExpression))
            is KtForExpression -> expr<UForEachExpression>(build(::KotlinUForEachExpression))
            is KtWhenExpression -> expr<USwitchExpression>(build(::KotlinUSwitchExpression))
            is KtBreakExpression -> expr<UBreakExpression>(build(::KotlinUBreakExpression))
            is KtContinueExpression -> expr<UContinueExpression>(build(::KotlinUContinueExpression))
            is KtReturnExpression -> expr<UReturnExpression>(build(::KotlinUReturnExpression))
            is KtThrowExpression -> expr<UThrowExpression>(build(::KotlinUThrowExpression))
            is KtBlockExpression -> expr<UBlockExpression>(build(::KotlinUBlockExpression))
            is KtConstantExpression -> expr<ULiteralExpression>(build(::KotlinULiteralExpression))
            is KtTryExpression -> expr<UTryExpression>(build(::KotlinUTryExpression))
            is KtArrayAccessExpression -> expr<UArrayAccessExpression>(build(::KotlinUArrayAccessExpression))
            is KtLambdaExpression -> expr<ULambdaExpression>(build(::KotlinULambdaExpression))
            is KtBinaryExpressionWithTypeRHS -> expr<UBinaryExpressionWithType>(build(::KotlinUBinaryExpressionWithType))
            is KtClassOrObject -> expr<UDeclarationsExpression> {
                expression.toLightClass()?.let { lightClass ->
                    val parent = if (parentCallback == null) null else (parentCallback() ?: return null)
                    KotlinUDeclarationsExpression(parent).apply {
                        declarations = listOf(KotlinUClass.create(lightClass, this))
                    }
                } ?: UastEmptyExpression
            }
            is KtFunction -> if (expression.name.isNullOrEmpty()) {
                expr<ULambdaExpression>(build(::createLocalFunctionLambdaExpression))
            }
            else {
                expr<UDeclarationsExpression>(build(::createLocalFunctionDeclaration))
            }

            else -> expr<UExpression>(build(::UnknownKotlinExpression))
        }' @ [291:38] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UExpression?, entry1: UExpression?, entry2: UExpression?, entry3: UExpression?, entry4: UExpression?, entry5: UExpression?, entry6: UExpression?, entry7: UExpression?, entry8: UExpression?, entry9: UExpression?, entry10: UExpression?, entry11: UExpression?, entry12: UExpression?, entry13: UExpression?, entry14: UExpression?, entry15: UExpression?, entry16: UExpression?, entry17: UExpression?, entry18: UExpression?, entry19: UExpression?, entry20: UExpression?, entry21: UExpression?, entry22: UExpression?, entry23: UExpression?, entry24: UExpression?, entry25: UExpression?, entry26: UExpression?, entry27: UExpression?, entry28: UExpression?, entry29: UExpression?, entry30: UExpression?, entry31: UExpression?, entry32: UExpression?, entry33: UExpression?, entry34: UExpression?, entry35: UExpression?): UExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UExpression?

'expression' @ [291:44] ==> value-parameter expression: KtExpression defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[ValueParameterDescriptorImpl]

'expr' @ [292:41] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UDeclarationsExpression

'build' @ [292:71] ==> local final fun <P : PsiElement> build(ctor: (KtVariableDeclaration, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtVariableDeclaration

'when {
                    expression.entries.isEmpty() -> {
                        val parent = if (parentCallback == null) null else (parentCallback() ?: return null)
                        expr<ULiteralExpression> { KotlinStringULiteralExpression(expression, parent, "") }
                    }
                    expression.entries.size == 1 -> convertEntry(expression.entries[0], parentCallback, requiredType)
                    else -> {
                        val parent = if (parentCallback == null) null else (parentCallback() ?: return null)
                        expr<UExpression> { KotlinStringTemplateUPolyadicExpression(expression, parent) }
                    }
                }' @ [295:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UExpression?, entry1: UExpression?, entry2: UExpression?): UExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UExpression?

'expression' @ [296:21] ==> value-parameter expression: KtExpression defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[ValueParameterDescriptorImpl]

'entries' @ [296:32] ==> public final val KtStringTemplateExpression.entries: (Array<(KtStringTemplateEntry..KtStringTemplateEntry?)>..Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>)[MyPropertyDescriptor]

'isEmpty' @ [296:40] ==> @InlineOnly public inline fun <T> Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtStringTemplateEntry..org.jetbrains.kotlin.psi.KtStringTemplateEntry?)

'if (parentCallback == null) null else (parentCallback() ?: return null)' @ [297:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UElement?, elseBranch: UElement?): UElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UElement?

'parentCallback' @ [297:42] ==> value-parameter parentCallback: (() -> UElement?)? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[ValueParameterDescriptorImpl]

'invoke' @ [297:77] ==> public abstract operator fun invoke(): UElement? defined in kotlin.Function0[FunctionInvokeDescriptor]

'expr' @ [298:25] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> ULiteralExpression

'KotlinStringULiteralExpression' @ [298:52] ==> public constructor KotlinStringULiteralExpression(psi: PsiElement, uastParent: UElement?, text: String) defined in org.jetbrains.uast.kotlin.KotlinStringULiteralExpression[ClassConstructorDescriptorImpl]

'expression' @ [298:83] ==> value-parameter expression: KtExpression defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[ValueParameterDescriptorImpl]

'parent' @ [298:95] ==> val parent: UElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression.<anonymous>[LocalVariableDescriptor]

'expression' @ [300:21] ==> value-parameter expression: KtExpression defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[ValueParameterDescriptorImpl]

'entries' @ [300:32] ==> public final val KtStringTemplateExpression.entries: (Array<(KtStringTemplateEntry..KtStringTemplateEntry?)>..Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>)[MyPropertyDescriptor]

'size' @ [300:40] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'convertEntry' @ [300:53] ==> internal final fun convertEntry(entry: KtStringTemplateEntry, parentCallback: (() -> UElement?)?, requiredType: Class<out UElement>? = ...): UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'expression' @ [300:66] ==> value-parameter expression: KtExpression defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[ValueParameterDescriptorImpl]

'entries' @ [300:77] ==> public final val KtStringTemplateExpression.entries: (Array<(KtStringTemplateEntry..KtStringTemplateEntry?)>..Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>)[MyPropertyDescriptor]

'parentCallback' @ [300:89] ==> value-parameter parentCallback: (() -> UElement?)? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[ValueParameterDescriptorImpl]

'requiredType' @ [300:105] ==> value-parameter requiredType: Class<out UElement>? = ... defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[ValueParameterDescriptorImpl]

'if (parentCallback == null) null else (parentCallback() ?: return null)' @ [302:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UElement?, elseBranch: UElement?): UElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UElement?

'parentCallback' @ [302:42] ==> value-parameter parentCallback: (() -> UElement?)? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[ValueParameterDescriptorImpl]

'invoke' @ [302:77] ==> public abstract operator fun invoke(): UElement? defined in kotlin.Function0[FunctionInvokeDescriptor]

'expr' @ [303:25] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UExpression

'KotlinStringTemplateUPolyadicExpression' @ [303:45] ==> public constructor KotlinStringTemplateUPolyadicExpression(psi: KtStringTemplateExpression, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinStringTemplateUPolyadicExpression[ClassConstructorDescriptorImpl]

'expression' @ [303:85] ==> value-parameter expression: KtExpression defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[ValueParameterDescriptorImpl]

'parent' @ [303:97] ==> val parent: UElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression.<anonymous>[LocalVariableDescriptor]

'expr' @ [307:46] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UDeclarationsExpression

'if (parentCallback == null) null else (parentCallback() ?: return null)' @ [308:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UElement?, elseBranch: UElement?): UElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UElement?

'parentCallback' @ [308:34] ==> value-parameter parentCallback: (() -> UElement?)? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[ValueParameterDescriptorImpl]

'invoke' @ [308:69] ==> public abstract operator fun invoke(): UElement? defined in kotlin.Function0[FunctionInvokeDescriptor]

'KotlinUDeclarationsExpression' @ [309:17] ==> public constructor KotlinUDeclarationsExpression(uastParent: UElement?) defined in org.jetbrains.uast.KotlinUDeclarationsExpression[ClassConstructorDescriptorImpl]

'parent' @ [309:47] ==> val parent: UElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression.<anonymous>.<anonymous>[LocalVariableDescriptor]

'apply' @ [309:55] ==> @InlineOnly public inline fun <T> KotlinUDeclarationsExpression.apply(block: KotlinUDeclarationsExpression.() -> Unit): KotlinUDeclarationsExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinUDeclarationsExpression

'KotlinULocalVariable' @ [310:42] ==> public constructor KotlinULocalVariable(psi: PsiLocalVariable, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinULocalVariable[ClassConstructorDescriptorImpl]

'UastKotlinPsiVariable' @ [310:63] ==> public companion object defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable[FakeCallableDescriptorForObject]

'create' @ [310:85] ==> public final fun create(declaration: KtDestructuringDeclaration, containingElement: UElement): PsiLocalVariable defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [310:92] ==> value-parameter expression: KtExpression defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[ValueParameterDescriptorImpl]

'parent' @ [310:104] ==> val parent: UElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression.<anonymous>.<anonymous>[LocalVariableDescriptor]

'parent' @ [310:115] ==> val parent: UElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression.<anonymous>.<anonymous>[LocalVariableDescriptor]

'expression' @ [311:52] ==> value-parameter expression: KtExpression defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[ValueParameterDescriptorImpl]

'entries' @ [311:63] ==> public final val KtDestructuringDeclaration.entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>)[MyPropertyDescriptor]

'mapIndexed' @ [311:71] ==> public inline fun <T, R> Iterable<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>.mapIndexed(transform: (index: Int, (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)) -> KotlinULocalVariable): List<KotlinULocalVariable> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry..org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry?)
    <R> -> KotlinULocalVariable

'KtPsiFactory' @ [312:42] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'expression' @ [312:55] ==> value-parameter expression: KtExpression defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[ValueParameterDescriptorImpl]

'project' @ [312:66] ==> public final val KtDestructuringDeclaration.project: Project[MyPropertyDescriptor]

'psiFactory' @ [313:43] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression.<anonymous>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'createAnalyzableExpression' @ [313:54] ==> internal final fun KtPsiFactory.createAnalyzableExpression(text: String, context: PsiElement): KtExpression defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'tempAssignment' @ [313:84] ==> val tempAssignment: KotlinULocalVariable defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'name' @ [313:99] ==> public final val KotlinULocalVariable.name: String?[MyPropertyDescriptor]

'i' @ [313:116] ==> value-parameter i: Int defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [314:81] ==> value-parameter expression: KtExpression defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[ValueParameterDescriptorImpl]

'containingFile' @ [314:92] ==> public final val KtDestructuringDeclaration.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'KotlinULocalVariable' @ [315:25] ==> public constructor KotlinULocalVariable(psi: PsiLocalVariable, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinULocalVariable[ClassConstructorDescriptorImpl]

'UastKotlinPsiVariable' @ [315:46] ==> public companion object defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable[FakeCallableDescriptorForObject]

'create' @ [315:68] ==> public final fun create(declaration: KtVariableDeclaration, parent: PsiElement?, containingElement: UElement, initializer: KtExpression? = ...): PsiLocalVariable defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion[SimpleFunctionDescriptorImpl]

'entry' @ [315:75] ==> value-parameter entry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'tempAssignment' @ [315:82] ==> val tempAssignment: KotlinULocalVariable defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'psi' @ [315:97] ==> public open val psi: PsiLocalVariable defined in org.jetbrains.uast.kotlin.KotlinULocalVariable[PropertyDescriptorImpl]

'parent' @ [315:102] ==> val parent: UElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression.<anonymous>.<anonymous>[LocalVariableDescriptor]

'initializer' @ [315:110] ==> val initializer: KtExpression defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression.<anonymous>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'parent' @ [315:124] ==> val parent: UElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression.<anonymous>.<anonymous>[LocalVariableDescriptor]

'declarations' @ [317:21] ==> public open lateinit var declarations: List<UDeclaration> defined in org.jetbrains.uast.KotlinUDeclarationsExpression[PropertyDescriptorImpl]

'listOf' @ [317:36] ==> public fun <T> listOf(element: KotlinULocalVariable): List<KotlinULocalVariable> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinULocalVariable

'tempAssignment' @ [317:43] ==> val tempAssignment: KotlinULocalVariable defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'destructuringAssignments' @ [317:61] ==> val destructuringAssignments: List<KotlinULocalVariable> defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'expr' @ [320:39] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> ULabeledExpression

'build' @ [320:64] ==> local final fun <P : PsiElement> build(ctor: (KtLabeledExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtLabeledExpression

'expr' @ [321:44] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UClassLiteralExpression

'build' @ [321:74] ==> local final fun <P : PsiElement> build(ctor: (KtClassLiteralExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtClassLiteralExpression

'expr' @ [322:45] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UObjectLiteralExpression

'build' @ [322:76] ==> local final fun <P : PsiElement> build(ctor: (KtObjectLiteralExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtObjectLiteralExpression

'expr' @ [323:44] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UQualifiedReferenceExpression

'build' @ [323:80] ==> local final fun <P : PsiElement> build(ctor: (KtDotQualifiedExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtDotQualifiedExpression

'expr' @ [324:45] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UQualifiedReferenceExpression

'build' @ [324:81] ==> local final fun <P : PsiElement> build(ctor: (KtSafeQualifiedExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtSafeQualifiedExpression

'expr' @ [325:42] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> USimpleNameReferenceExpression

'build' @ [325:79] ==> local final fun <P : PsiElement> build(ctor: (KtSimpleNameExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtSimpleNameExpression

'expr' @ [326:36] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UCallExpression

'build' @ [326:58] ==> local final fun <P : PsiElement> build(ctor: (KtCallExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtCallExpression

'if (expression.operationToken == KtTokens.ELVIS) {
                    expr<UExpressionList>(build(::createElvisExpression))
                }
                else expr<UBinaryExpression>(build(::KotlinUBinaryExpression))' @ [328:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UExpression?, elseBranch: UExpression?): UExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UExpression?

'expression' @ [328:21] ==> value-parameter expression: KtExpression defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[ValueParameterDescriptorImpl]

'operationToken' @ [328:32] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'ELVIS' @ [328:59] ==> public final val ELVIS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'expr' @ [329:21] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UExpressionList

'build' @ [329:43] ==> local final fun <P : PsiElement> build(ctor: (KtBinaryExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtBinaryExpression

'expr' @ [331:22] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UBinaryExpression

'build' @ [331:46] ==> local final fun <P : PsiElement> build(ctor: (KtBinaryExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtBinaryExpression

'expr' @ [333:45] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UParenthesizedExpression

'build' @ [333:76] ==> local final fun <P : PsiElement> build(ctor: (KtParenthesizedExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtParenthesizedExpression

'expr' @ [334:38] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UPrefixExpression

'build' @ [334:62] ==> local final fun <P : PsiElement> build(ctor: (KtPrefixExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtPrefixExpression

'expr' @ [335:39] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UPostfixExpression

'build' @ [335:64] ==> local final fun <P : PsiElement> build(ctor: (KtPostfixExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtPostfixExpression

'expr' @ [336:36] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UThisExpression

'build' @ [336:58] ==> local final fun <P : PsiElement> build(ctor: (KtThisExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtThisExpression

'expr' @ [337:37] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> USuperExpression

'build' @ [337:60] ==> local final fun <P : PsiElement> build(ctor: (KtSuperExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtSuperExpression

'expr' @ [338:49] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UCallableReferenceExpression

'build' @ [338:84] ==> local final fun <P : PsiElement> build(ctor: (KtCallableReferenceExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtCallableReferenceExpression

'expr' @ [339:34] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UBinaryExpressionWithType

'build' @ [339:66] ==> local final fun <P : PsiElement> build(ctor: (KtIsExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtIsExpression

'expr' @ [340:34] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UIfExpression

'build' @ [340:54] ==> local final fun <P : PsiElement> build(ctor: (KtIfExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtIfExpression

'expr' @ [341:37] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UWhileExpression

'build' @ [341:60] ==> local final fun <P : PsiElement> build(ctor: (KtWhileExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtWhileExpression

'expr' @ [342:39] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UDoWhileExpression

'build' @ [342:64] ==> local final fun <P : PsiElement> build(ctor: (KtDoWhileExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtDoWhileExpression

'expr' @ [343:35] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UForEachExpression

'build' @ [343:60] ==> local final fun <P : PsiElement> build(ctor: (KtForExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtForExpression

'expr' @ [344:36] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> USwitchExpression

'build' @ [344:60] ==> local final fun <P : PsiElement> build(ctor: (KtWhenExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtWhenExpression

'expr' @ [345:37] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UBreakExpression

'build' @ [345:60] ==> local final fun <P : PsiElement> build(ctor: (KtBreakExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtBreakExpression

'expr' @ [346:40] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UContinueExpression

'build' @ [346:66] ==> local final fun <P : PsiElement> build(ctor: (KtContinueExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtContinueExpression

'expr' @ [347:38] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UReturnExpression

'build' @ [347:62] ==> local final fun <P : PsiElement> build(ctor: (KtReturnExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtReturnExpression

'expr' @ [348:37] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UThrowExpression

'build' @ [348:60] ==> local final fun <P : PsiElement> build(ctor: (KtThrowExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtThrowExpression

'expr' @ [349:37] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UBlockExpression

'build' @ [349:60] ==> local final fun <P : PsiElement> build(ctor: (KtBlockExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtBlockExpression

'expr' @ [350:40] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> ULiteralExpression

'build' @ [350:65] ==> local final fun <P : PsiElement> build(ctor: (KtConstantExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtConstantExpression

'expr' @ [351:35] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UTryExpression

'build' @ [351:56] ==> local final fun <P : PsiElement> build(ctor: (KtTryExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtTryExpression

'expr' @ [352:43] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UArrayAccessExpression

'build' @ [352:72] ==> local final fun <P : PsiElement> build(ctor: (KtArrayAccessExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtArrayAccessExpression

'expr' @ [353:38] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> ULambdaExpression

'build' @ [353:62] ==> local final fun <P : PsiElement> build(ctor: (KtLambdaExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtLambdaExpression

'expr' @ [354:49] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UBinaryExpressionWithType

'build' @ [354:81] ==> local final fun <P : PsiElement> build(ctor: (KtBinaryExpressionWithTypeRHS, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtBinaryExpressionWithTypeRHS

'expr' @ [355:35] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UDeclarationsExpression

'expression' @ [356:17] ==> value-parameter expression: KtExpression defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[ValueParameterDescriptorImpl]

'toLightClass' @ [356:28] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'let' @ [356:44] ==> @InlineOnly public inline fun <T, R> KtLightClass.let(block: (KtLightClass) -> KotlinUDeclarationsExpression): KotlinUDeclarationsExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLightClass
    <R> -> KotlinUDeclarationsExpression

'if (parentCallback == null) null else (parentCallback() ?: return null)' @ [357:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UElement?, elseBranch: UElement?): UElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UElement?

'parentCallback' @ [357:38] ==> value-parameter parentCallback: (() -> UElement?)? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[ValueParameterDescriptorImpl]

'invoke' @ [357:73] ==> public abstract operator fun invoke(): UElement? defined in kotlin.Function0[FunctionInvokeDescriptor]

'KotlinUDeclarationsExpression' @ [358:21] ==> public constructor KotlinUDeclarationsExpression(uastParent: UElement?) defined in org.jetbrains.uast.KotlinUDeclarationsExpression[ClassConstructorDescriptorImpl]

'parent' @ [358:51] ==> val parent: UElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'apply' @ [358:59] ==> @InlineOnly public inline fun <T> KotlinUDeclarationsExpression.apply(block: KotlinUDeclarationsExpression.() -> Unit): KotlinUDeclarationsExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinUDeclarationsExpression

'declarations' @ [359:25] ==> public open lateinit var declarations: List<UDeclaration> defined in org.jetbrains.uast.KotlinUDeclarationsExpression[PropertyDescriptorImpl]

'listOf' @ [359:40] ==> public fun <T> listOf(element: UClass): List<UClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UClass

'KotlinUClass' @ [359:47] ==> public companion object defined in org.jetbrains.uast.kotlin.KotlinUClass[FakeCallableDescriptorForObject]

'create' @ [359:60] ==> public final fun create(psi: KtLightClass, containingElement: UElement?): UClass defined in org.jetbrains.uast.kotlin.KotlinUClass.Companion[SimpleFunctionDescriptorImpl]

'lightClass' @ [359:67] ==> value-parameter lightClass: KtLightClass defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [359:79] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'UastEmptyExpression' @ [361:22] ==> public object UastEmptyExpression : UExpression defined in org.jetbrains.uast[FakeCallableDescriptorForObject]

'if (expression.name.isNullOrEmpty()) {
                expr<ULambdaExpression>(build(::createLocalFunctionLambdaExpression))
            }
            else {
                expr<UDeclarationsExpression>(build(::createLocalFunctionDeclaration))
            }' @ [363:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UExpression?, elseBranch: UExpression?): UExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UExpression?

'expression' @ [363:34] ==> value-parameter expression: KtExpression defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[ValueParameterDescriptorImpl]

'name' @ [363:45] ==> public final val KtFunction.name: String?[MyPropertyDescriptor]

'isNullOrEmpty' @ [363:50] ==> @InlineOnly public inline fun CharSequence?.isNullOrEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expr' @ [364:17] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> ULambdaExpression

'build' @ [364:41] ==> local final fun <P : PsiElement> build(ctor: (KtFunction, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtFunction

'expr' @ [367:17] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UDeclarationsExpression

'build' @ [367:47] ==> local final fun <P : PsiElement> build(ctor: (KtFunction, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtFunction

'expr' @ [370:21] ==> internal inline fun <reified ActualT : UElement> Class<out UElement>?.expr(f: () -> UExpression?): UExpression? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified ActualT : UElement> -> UExpression

'build' @ [370:39] ==> local final fun <P : PsiElement> build(ctor: (KtExpression, UElement?) -> UExpression): () -> UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtExpression

'expression' @ [375:16] ==> value-parameter expression: KtExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertOrEmpty[ValueParameterDescriptorImpl]

'let' @ [375:28] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> UExpression?): UExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> UExpression?

'convertExpression' @ [375:34] ==> internal final fun convertExpression(expression: KtExpression, parentCallback: (() -> UElement?)?, requiredType: Class<out UElement>? = ...): UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'it' @ [375:52] ==> value-parameter it: KtExpression defined in org.jetbrains.uast.kotlin.KotlinConverter.convertOrEmpty.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [375:56] ==> value-parameter parent: UElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertOrEmpty[ValueParameterDescriptorImpl]

'toCallback' @ [375:63] ==> internal fun UElement?.toCallback(): (() -> UElement?)? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]

'UastEmptyExpression' @ [375:88] ==> public object UastEmptyExpression : UExpression defined in org.jetbrains.uast[FakeCallableDescriptorForObject]

'if (expression != null) convertExpression(expression, parent.toCallback(), null) else null' @ [379:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UExpression?, elseBranch: UExpression?): UExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UExpression?

'expression' @ [379:20] ==> value-parameter expression: KtExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertOrNull[ValueParameterDescriptorImpl]

'convertExpression' @ [379:40] ==> internal final fun convertExpression(expression: KtExpression, parentCallback: (() -> UElement?)?, requiredType: Class<out UElement>? = ...): UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'expression' @ [379:58] ==> value-parameter expression: KtExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertOrNull[ValueParameterDescriptorImpl]

'parent' @ [379:70] ==> value-parameter parent: UElement? defined in org.jetbrains.uast.kotlin.KotlinConverter.convertOrNull[ValueParameterDescriptorImpl]

'toCallback' @ [379:77] ==> internal fun UElement?.toCallback(): (() -> UElement?)? defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]

'createAnalyzableProperty' @ [383:13] ==> internal final fun KtPsiFactory.createAnalyzableProperty(text: String, context: PsiElement): KtProperty defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'text' @ [383:48] ==> value-parameter text: String defined in org.jetbrains.uast.kotlin.KotlinConverter.createAnalyzableExpression[ValueParameterDescriptorImpl]

'context' @ [383:55] ==> value-parameter context: PsiElement defined in org.jetbrains.uast.kotlin.KotlinConverter.createAnalyzableExpression[ValueParameterDescriptorImpl]

'initializer' @ [383:64] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'error' @ [383:79] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'text' @ [383:127] ==> value-parameter text: String defined in org.jetbrains.uast.kotlin.KotlinConverter.createAnalyzableExpression[ValueParameterDescriptorImpl]

'createAnalyzableDeclaration' @ [386:13] ==> internal final fun <TDeclaration : KtDeclaration> KtPsiFactory.createAnalyzableDeclaration(text: String, context: PsiElement): KtProperty defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]
Inferred types:
    <TDeclaration : KtDeclaration> -> KtProperty

'text' @ [386:41] ==> value-parameter text: String defined in org.jetbrains.uast.kotlin.KotlinConverter.createAnalyzableProperty[ValueParameterDescriptorImpl]

'context' @ [386:47] ==> value-parameter context: PsiElement defined in org.jetbrains.uast.kotlin.KotlinConverter.createAnalyzableProperty[ValueParameterDescriptorImpl]

'createAnalyzableFile' @ [389:20] ==> public final fun createAnalyzableFile(fileName: String, text: String, contextToAnalyzeIn: PsiElement): KtFile defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'text' @ [389:53] ==> value-parameter text: String defined in org.jetbrains.uast.kotlin.KotlinConverter.createAnalyzableDeclaration[ValueParameterDescriptorImpl]

'context' @ [389:59] ==> value-parameter context: PsiElement defined in org.jetbrains.uast.kotlin.KotlinConverter.createAnalyzableDeclaration[ValueParameterDescriptorImpl]

'file' @ [390:28] ==> val file: KtFile defined in org.jetbrains.uast.kotlin.KotlinConverter.createAnalyzableDeclaration[LocalVariableDescriptor]

'declarations' @ [390:33] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'assert' @ [391:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'declarations' @ [391:16] ==> val declarations: List<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.uast.kotlin.KotlinConverter.createAnalyzableDeclaration[LocalVariableDescriptor]

'size' @ [391:29] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'declarations' @ [391:45] ==> val declarations: List<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.uast.kotlin.KotlinConverter.createAnalyzableDeclaration[LocalVariableDescriptor]

'size' @ [391:58] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'text' @ [391:81] ==> value-parameter text: String defined in org.jetbrains.uast.kotlin.KotlinConverter.createAnalyzableDeclaration[ValueParameterDescriptorImpl]

'declarations' @ [392:16] ==> val declarations: List<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.uast.kotlin.KotlinConverter.createAnalyzableDeclaration[LocalVariableDescriptor]

'first' @ [392:29] ==> public fun <T> List<(KtDeclaration..KtDeclaration?)>.first(): (KtDeclaration..KtDeclaration?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'getChildOfType' @ [396:25] ==> @Nullable public open fun <T : (PsiElement..PsiElement?)> getChildOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtExpression..KtExpression?)>): KtExpression? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtExpression

'this' @ [396:40] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinConverter.getExpression[ReceiverParameterDescriptorImpl]

'java' @ [396:66] ==> public val <T> KClass<KtExpression>.java: Class<KtExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtExpression

'parent' @ [403:28] ==> value-parameter parent: UElement? defined in org.jetbrains.uast.kotlin.convertVariablesDeclaration[ValueParameterDescriptorImpl]

'psi' @ [403:36] ==> public abstract val psi: PsiElement? defined in org.jetbrains.uast.UElement[DeserializedPropertyDescriptor]

'KotlinUAnnotatedLocalVariable' @ [404:20] ==> public constructor KotlinUAnnotatedLocalVariable(psi: PsiLocalVariable, uastParent: UElement?, computeAnnotations: (parent: UElement) -> List<UAnnotation>) defined in org.jetbrains.uast.kotlin.KotlinUAnnotatedLocalVariable[ClassConstructorDescriptorImpl]

'UastKotlinPsiVariable' @ [405:13] ==> public companion object defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable[FakeCallableDescriptorForObject]

'create' @ [405:35] ==> public final fun create(declaration: KtVariableDeclaration, parent: PsiElement?, containingElement: UElement, initializer: KtExpression? = ...): PsiLocalVariable defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion[SimpleFunctionDescriptorImpl]

'psi' @ [405:42] ==> value-parameter psi: KtVariableDeclaration defined in org.jetbrains.uast.kotlin.convertVariablesDeclaration[ValueParameterDescriptorImpl]

'parentPsiElement' @ [405:47] ==> val parentPsiElement: PsiElement? defined in org.jetbrains.uast.kotlin.convertVariablesDeclaration[LocalVariableDescriptor]

'parent' @ [405:65] ==> value-parameter parent: UElement? defined in org.jetbrains.uast.kotlin.convertVariablesDeclaration[ValueParameterDescriptorImpl]

'parent' @ [405:76] ==> value-parameter parent: UElement? defined in org.jetbrains.uast.kotlin.convertVariablesDeclaration[ValueParameterDescriptorImpl]

'psi' @ [406:9] ==> value-parameter psi: KtVariableDeclaration defined in org.jetbrains.uast.kotlin.convertVariablesDeclaration[ValueParameterDescriptorImpl]

'annotationEntries' @ [406:13] ==> public final val KtVariableDeclaration.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'map' @ [406:31] ==> public inline fun <T, R> Iterable<(KtAnnotationEntry..KtAnnotationEntry?)>.map(transform: ((KtAnnotationEntry..KtAnnotationEntry?)) -> KotlinUAnnotation): List<KotlinUAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)
    <R> -> KotlinUAnnotation

'KotlinUAnnotation' @ [406:37] ==> public constructor KotlinUAnnotation(psi: KtAnnotationEntry, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinUAnnotation[ClassConstructorDescriptorImpl]

'it' @ [406:55] ==> value-parameter it: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.uast.kotlin.convertVariablesDeclaration.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'annotationParent' @ [406:59] ==> value-parameter annotationParent: UElement defined in org.jetbrains.uast.kotlin.convertVariablesDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'KotlinUDeclarationsExpression' @ [408:12] ==> public constructor KotlinUDeclarationsExpression(uastParent: UElement?) defined in org.jetbrains.uast.KotlinUDeclarationsExpression[ClassConstructorDescriptorImpl]

'parent' @ [408:42] ==> value-parameter parent: UElement? defined in org.jetbrains.uast.kotlin.convertVariablesDeclaration[ValueParameterDescriptorImpl]

'apply' @ [408:50] ==> @InlineOnly public inline fun <T> KotlinUDeclarationsExpression.apply(block: KotlinUDeclarationsExpression.() -> Unit): KotlinUDeclarationsExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinUDeclarationsExpression

'declarations' @ [408:58] ==> public open lateinit var declarations: List<UDeclaration> defined in org.jetbrains.uast.KotlinUDeclarationsExpression[PropertyDescriptorImpl]

'listOf' @ [408:73] ==> public fun <T> listOf(element: KotlinUAnnotatedLocalVariable): List<KotlinUAnnotatedLocalVariable> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinUAnnotatedLocalVariable

'variable' @ [408:80] ==> val variable: KotlinUAnnotatedLocalVariable defined in org.jetbrains.uast.kotlin.convertVariablesDeclaration[LocalVariableDescriptor]

