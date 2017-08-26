'LightVariableBuilder' @ [30:5] ==> public constructor LightVariableBuilder(p0: (PsiManager..PsiManager?), @NotNull p1: String, @NotNull p2: PsiType, p3: (Language..Language?)) defined in org.jetbrains.kotlin.asJava.elements.LightVariableBuilder[JavaClassConstructorDescriptor]

'manager' @ [30:26] ==> value-parameter manager: PsiManager defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.<init>[ValueParameterDescriptorImpl]

'name' @ [30:35] ==> value-parameter name: String defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.<init>[ValueParameterDescriptorImpl]

'type' @ [30:41] ==> value-parameter type: PsiType defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.<init>[ValueParameterDescriptorImpl]

'INSTANCE' @ [30:62] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'lz' @ [32:51] ==> internal fun <T> lz(initializer: () -> LightTypeElement): Lazy<LightTypeElement> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> LightTypeElement

'LightTypeElement' @ [33:9] ==> public constructor LightTypeElement(p0: (PsiManager..PsiManager?), p1: (PsiType..PsiType?)) defined in com.intellij.psi.impl.light.LightTypeElement[JavaClassConstructorDescriptor]

'manager' @ [33:26] ==> value-parameter manager: PsiManager defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.<init>[ValueParameterDescriptorImpl]

'type' @ [33:35] ==> value-parameter type: PsiType defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.<init>[ValueParameterDescriptorImpl]

'lz' @ [36:51] ==> internal fun <T> lz(initializer: () -> KotlinUastPsiExpression?): Lazy<KotlinUastPsiExpression?> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> KotlinUastPsiExpression?

'ktInitializer' @ [37:9] ==> public final val ktInitializer: KtExpression? defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable[PropertyDescriptorImpl]

'let' @ [37:24] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KotlinUastPsiExpression): KotlinUastPsiExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KotlinUastPsiExpression

'KotlinUastPsiExpression' @ [37:30] ==> public constructor KotlinUastPsiExpression(ktExpression: KtExpression, parent: UElement) defined in org.jetbrains.uast.kotlin.psi.KotlinUastPsiExpression[ClassConstructorDescriptorImpl]

'it' @ [37:54] ==> value-parameter it: KtExpression defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.psiInitializer.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'containingElement' @ [37:58] ==> public final val containingElement: UElement defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable[PropertyDescriptorImpl]

'psiParent' @ [40:32] ==> public final val psiParent: PsiElement? defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable[PropertyDescriptorImpl]

'ktInitializer' @ [42:37] ==> public final val ktInitializer: KtExpression? defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable[PropertyDescriptorImpl]

'psiInitializer' @ [44:53] ==> private final val psiInitializer: PsiExpression? defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable[PropertyDescriptorImpl]

'psiTypeElement' @ [46:37] ==> private final val psiTypeElement: PsiTypeElement defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable[PropertyDescriptorImpl]

'NotImplementedError' @ [48:70] ==> public constructor NotImplementedError(message: String = ...) defined in kotlin.NotImplementedError[DeserializedClassConstructorDescriptor]

'ktElement' @ [50:50] ==> public final val ktElement: KtElement defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable[PropertyDescriptorImpl]

'containingFile' @ [50:60] ==> public final val KtElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'this' @ [53:13] ==> <this> defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable[LazyClassReceiverParameterDescriptor]

'other' @ [53:22] ==> value-parameter other: Any? defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.equals[ValueParameterDescriptorImpl]

'other' @ [54:13] ==> value-parameter other: Any? defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.equals[ValueParameterDescriptorImpl]

'other' @ [54:30] ==> value-parameter other: Any? defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.equals[ValueParameterDescriptorImpl]

'java' @ [54:43] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'this' @ [54:51] ==> <this> defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable[LazyClassReceiverParameterDescriptor]

'java' @ [54:63] ==> public val <T> KClass<out UastKotlinPsiVariable>.java: Class<out UastKotlinPsiVariable> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> UastKotlinPsiVariable

'ktElement' @ [55:16] ==> public final val ktElement: KtElement defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable[PropertyDescriptorImpl]

'other' @ [55:30] ==> value-parameter other: Any? defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.equals[ValueParameterDescriptorImpl]

'ktElement' @ [55:64] ==> public final val ktElement: KtElement defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable[PropertyDescriptorImpl]

'ktElement' @ [58:31] ==> public final val ktElement: KtElement defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable[PropertyDescriptorImpl]

'hashCode' @ [58:41] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.psi.KtElement[DeserializedSimpleFunctionDescriptor]

'containingElement' @ [67:29] ==> value-parameter containingElement: UElement defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'getParentOfType' @ [67:47] ==> public inline fun <reified T : UElement> UElement.getParentOfType(strict: Boolean = ...): UDeclaration? defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : UElement> -> UDeclaration

'psi' @ [67:80] ==> public abstract val psi: PsiModifierListOwner defined in org.jetbrains.uast.UDeclaration[DeserializedPropertyDescriptor]

'parent' @ [67:87] ==> value-parameter parent: PsiElement? defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'UastKotlinPsiVariable' @ [68:20] ==> public constructor UastKotlinPsiVariable(manager: PsiManager, name: String, type: PsiType, ktInitializer: KtExpression?, psiParent: PsiElement?, containingElement: UElement, ktElement: KtElement) defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable[ClassConstructorDescriptorImpl]

'declaration' @ [69:21] ==> value-parameter declaration: KtVariableDeclaration defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'manager' @ [69:33] ==> public final val KtVariableDeclaration.manager: (PsiManager..PsiManager?)[MyPropertyDescriptor]

'declaration' @ [70:21] ==> value-parameter declaration: KtVariableDeclaration defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'name' @ [70:33] ==> public final val KtVariableDeclaration.name: String?[MyPropertyDescriptor]

'orAnonymous' @ [70:38] ==> @Suppress internal inline fun String?.orAnonymous(kind: String = ...): String defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [71:21] ==> value-parameter declaration: KtVariableDeclaration defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'typeReference' @ [71:33] ==> public final var KtVariableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'toPsiType' @ [71:47] ==> internal fun KtTypeReference?.toPsiType(source: UElement, boxed: Boolean = ...): PsiType defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'containingElement' @ [71:57] ==> value-parameter containingElement: UElement defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'initializer' @ [72:21] ==> value-parameter initializer: KtExpression? = ... defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'declaration' @ [72:36] ==> value-parameter declaration: KtVariableDeclaration defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'initializer' @ [72:48] ==> public final val KtVariableDeclaration.initializer: KtExpression?[MyPropertyDescriptor]

'psiParent' @ [73:21] ==> val psiParent: PsiElement? defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[LocalVariableDescriptor]

'containingElement' @ [74:21] ==> value-parameter containingElement: UElement defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'declaration' @ [75:21] ==> value-parameter declaration: KtVariableDeclaration defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'containingElement' @ [79:29] ==> value-parameter containingElement: UElement defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'getParentOfType' @ [79:47] ==> public inline fun <reified T : UElement> UElement.getParentOfType(strict: Boolean = ...): UDeclaration? defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : UElement> -> UDeclaration

'psi' @ [79:80] ==> public abstract val psi: PsiModifierListOwner defined in org.jetbrains.uast.UDeclaration[DeserializedPropertyDescriptor]

'declaration' @ [79:87] ==> value-parameter declaration: KtDestructuringDeclaration defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'parent' @ [79:99] ==> public final val KtDestructuringDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'UastKotlinPsiVariable' @ [80:20] ==> public constructor UastKotlinPsiVariable(manager: PsiManager, name: String, type: PsiType, ktInitializer: KtExpression?, psiParent: PsiElement?, containingElement: UElement, ktElement: KtElement) defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable[ClassConstructorDescriptorImpl]

'declaration' @ [81:21] ==> value-parameter declaration: KtDestructuringDeclaration defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'manager' @ [81:33] ==> public final val KtDestructuringDeclaration.manager: (PsiManagerEx..PsiManagerEx?)[MyPropertyDescriptor]

'+' @ [82:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'toHexString' @ [82:37] ==> public open fun toHexString(p0: Int): (String..String?) defined in java.lang.Integer[JavaMethodDescriptor]

'declaration' @ [82:49] ==> value-parameter declaration: KtDestructuringDeclaration defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'getHashCode' @ [82:61] ==> private fun PsiElement.getHashCode(): Int defined in org.jetbrains.uast.kotlin.psi in file UastKotlinPsiVariable.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [83:21] ==> value-parameter declaration: KtDestructuringDeclaration defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'initializer' @ [83:33] ==> public final val KtDestructuringDeclaration.initializer: KtExpression?[MyPropertyDescriptor]

'getType' @ [83:46] ==> private fun KtExpression.getType(parent: UElement): PsiType? defined in org.jetbrains.uast.kotlin.psi in file UastKotlinPsiVariable.kt[SimpleFunctionDescriptorImpl]

'containingElement' @ [83:54] ==> value-parameter containingElement: UElement defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'UastErrorType' @ [83:76] ==> public object UastErrorType : PsiType defined in org.jetbrains.uast[FakeCallableDescriptorForObject]

'declaration' @ [84:21] ==> value-parameter declaration: KtDestructuringDeclaration defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'initializer' @ [84:33] ==> public final val KtDestructuringDeclaration.initializer: KtExpression?[MyPropertyDescriptor]

'psiParent' @ [85:21] ==> val psiParent: (PsiElement..PsiElement?) defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[LocalVariableDescriptor]

'containingElement' @ [86:21] ==> value-parameter containingElement: UElement defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'declaration' @ [87:21] ==> value-parameter declaration: KtDestructuringDeclaration defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'containingElement' @ [91:29] ==> value-parameter containingElement: UElement defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'getParentOfType' @ [91:47] ==> public inline fun <reified T : UElement> UElement.getParentOfType(strict: Boolean = ...): UDeclaration? defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : UElement> -> UDeclaration

'psi' @ [91:80] ==> public abstract val psi: PsiModifierListOwner defined in org.jetbrains.uast.UDeclaration[DeserializedPropertyDescriptor]

'parent' @ [91:87] ==> value-parameter parent: PsiElement defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'UastKotlinPsiVariable' @ [92:20] ==> public constructor UastKotlinPsiVariable(manager: PsiManager, name: String, type: PsiType, ktInitializer: KtExpression?, psiParent: PsiElement?, containingElement: UElement, ktElement: KtElement) defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable[ClassConstructorDescriptorImpl]

'initializer' @ [93:21] ==> value-parameter initializer: KtExpression defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'manager' @ [93:33] ==> public final val KtExpression.manager: (PsiManager..PsiManager?)[MyPropertyDescriptor]

'+' @ [94:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'toHexString' @ [94:37] ==> public open fun toHexString(p0: Int): (String..String?) defined in java.lang.Integer[JavaMethodDescriptor]

'initializer' @ [94:49] ==> value-parameter initializer: KtExpression defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'getHashCode' @ [94:61] ==> private fun PsiElement.getHashCode(): Int defined in org.jetbrains.uast.kotlin.psi in file UastKotlinPsiVariable.kt[SimpleFunctionDescriptorImpl]

'initializer' @ [95:21] ==> value-parameter initializer: KtExpression defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'getType' @ [95:33] ==> private fun KtExpression.getType(parent: UElement): PsiType? defined in org.jetbrains.uast.kotlin.psi in file UastKotlinPsiVariable.kt[SimpleFunctionDescriptorImpl]

'containingElement' @ [95:41] ==> value-parameter containingElement: UElement defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'UastErrorType' @ [95:63] ==> public object UastErrorType : PsiType defined in org.jetbrains.uast[FakeCallableDescriptorForObject]

'initializer' @ [96:21] ==> value-parameter initializer: KtExpression defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'psiParent' @ [97:21] ==> val psiParent: PsiElement defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[LocalVariableDescriptor]

'containingElement' @ [98:21] ==> value-parameter containingElement: UElement defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'initializer' @ [99:21] ==> value-parameter initializer: KtExpression defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'containingElement' @ [103:29] ==> value-parameter containingElement: UElement defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'getParentOfType' @ [103:47] ==> public inline fun <reified T : UElement> UElement.getParentOfType(strict: Boolean = ...): UDeclaration? defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : UElement> -> UDeclaration

'psi' @ [103:80] ==> public abstract val psi: PsiModifierListOwner defined in org.jetbrains.uast.UDeclaration[DeserializedPropertyDescriptor]

'localFunction' @ [103:87] ==> value-parameter localFunction: KtFunction defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'parent' @ [103:101] ==> public final val KtFunction.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'UastKotlinPsiVariable' @ [104:20] ==> public constructor UastKotlinPsiVariable(manager: PsiManager, name: String, type: PsiType, ktInitializer: KtExpression?, psiParent: PsiElement?, containingElement: UElement, ktElement: KtElement) defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable[ClassConstructorDescriptorImpl]

'localFunction' @ [105:21] ==> value-parameter localFunction: KtFunction defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'manager' @ [105:35] ==> public final val KtFunction.manager: (PsiManager..PsiManager?)[MyPropertyDescriptor]

'name' @ [106:21] ==> value-parameter name: String defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'localFunction' @ [107:21] ==> value-parameter localFunction: KtFunction defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'getFunctionType' @ [107:35] ==> private fun KtFunction.getFunctionType(parent: UElement): PsiType? defined in org.jetbrains.uast.kotlin.psi in file UastKotlinPsiVariable.kt[SimpleFunctionDescriptorImpl]

'containingElement' @ [107:51] ==> value-parameter containingElement: UElement defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'UastErrorType' @ [107:73] ==> public object UastErrorType : PsiType defined in org.jetbrains.uast[FakeCallableDescriptorForObject]

'localFunction' @ [108:21] ==> value-parameter localFunction: KtFunction defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'psiParent' @ [109:21] ==> val psiParent: (PsiElement..PsiElement?) defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[LocalVariableDescriptor]

'containingElement' @ [110:21] ==> value-parameter containingElement: UElement defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'localFunction' @ [111:21] ==> value-parameter localFunction: KtFunction defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion.create[ValueParameterDescriptorImpl]

'ktExpression' @ [116:109] ==> value-parameter ktExpression: KtExpression defined in org.jetbrains.uast.kotlin.psi.KotlinUastPsiExpression.<init>[ValueParameterDescriptorImpl]

'ktExpression' @ [117:40] ==> public final val ktExpression: KtExpression defined in org.jetbrains.uast.kotlin.psi.KotlinUastPsiExpression[PropertyDescriptorImpl]

'getType' @ [117:53] ==> private fun KtExpression.getType(parent: UElement): PsiType? defined in org.jetbrains.uast.kotlin.psi in file UastKotlinPsiVariable.kt[SimpleFunctionDescriptorImpl]

'parent' @ [117:61] ==> public final val parent: UElement defined in org.jetbrains.uast.kotlin.psi.KotlinUastPsiExpression[PropertyDescriptorImpl]

'analyze' @ [121:22] ==> internal fun KtElement.analyze(): BindingContext defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'FUNCTION' @ [121:47] ==> public final val FUNCTION: (WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [121:57] ==> <this> defined in org.jetbrains.uast.kotlin.psi.getFunctionType[ReceiverParameterDescriptorImpl]

'descriptor' @ [122:22] ==> val descriptor: SimpleFunctionDescriptor defined in org.jetbrains.uast.kotlin.psi.getFunctionType[LocalVariableDescriptor]

'returnType' @ [122:33] ==> public final val SimpleFunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'createFunctionType' @ [124:12] ==> @JvmOverloads public fun createFunctionType(builtIns: KotlinBuiltIns, annotations: Annotations, receiverType: KotlinType?, parameterTypes: List<KotlinType>, parameterNames: List<Name>?, returnType: KotlinType, suspendFunction: Boolean = ...): SimpleType defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [125:13] ==> val descriptor: SimpleFunctionDescriptor defined in org.jetbrains.uast.kotlin.psi.getFunctionType[LocalVariableDescriptor]

'builtIns' @ [125:24] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'descriptor' @ [126:13] ==> val descriptor: SimpleFunctionDescriptor defined in org.jetbrains.uast.kotlin.psi.getFunctionType[LocalVariableDescriptor]

'annotations' @ [126:24] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor[DeserializedPropertyDescriptor]

'descriptor' @ [127:13] ==> val descriptor: SimpleFunctionDescriptor defined in org.jetbrains.uast.kotlin.psi.getFunctionType[LocalVariableDescriptor]

'extensionReceiverParameter' @ [127:24] ==> public final val SimpleFunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [127:52] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'descriptor' @ [128:13] ==> val descriptor: SimpleFunctionDescriptor defined in org.jetbrains.uast.kotlin.psi.getFunctionType[LocalVariableDescriptor]

'valueParameters' @ [128:24] ==> public final val SimpleFunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'map' @ [128:40] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> KotlinType

'it' @ [128:46] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.uast.kotlin.psi.getFunctionType.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [128:49] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'descriptor' @ [129:13] ==> val descriptor: SimpleFunctionDescriptor defined in org.jetbrains.uast.kotlin.psi.getFunctionType[LocalVariableDescriptor]

'valueParameters' @ [129:24] ==> public final val SimpleFunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'map' @ [129:40] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Name): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> Name

'it' @ [129:46] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.uast.kotlin.psi.getFunctionType.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [129:49] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'returnType' @ [130:13] ==> val returnType: KotlinType defined in org.jetbrains.uast.kotlin.psi.getFunctionType[LocalVariableDescriptor]

'toPsiType' @ [131:7] ==> internal fun KotlinType.toPsiType(source: UElement, element: KtElement, boxed: Boolean): PsiType defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'parent' @ [131:17] ==> value-parameter parent: UElement defined in org.jetbrains.uast.kotlin.psi.getFunctionType[ValueParameterDescriptorImpl]

'this' @ [131:25] ==> <this> defined in org.jetbrains.uast.kotlin.psi.getFunctionType[ReceiverParameterDescriptorImpl]

'analyze' @ [135:9] ==> internal fun KtElement.analyze(): BindingContext defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'EXPRESSION_TYPE_INFO' @ [135:34] ==> public final val EXPRESSION_TYPE_INFO: (WritableSlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>..WritableSlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [135:56] ==> <this> defined in org.jetbrains.uast.kotlin.psi.getType[ReceiverParameterDescriptorImpl]

'type' @ [135:63] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[DeserializedPropertyDescriptor]

'toPsiType' @ [135:69] ==> internal fun KotlinType.toPsiType(source: UElement, element: KtElement, boxed: Boolean): PsiType defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'parent' @ [135:79] ==> value-parameter parent: UElement defined in org.jetbrains.uast.kotlin.psi.getType[ValueParameterDescriptorImpl]

'this' @ [135:87] ==> <this> defined in org.jetbrains.uast.kotlin.psi.getType[ReceiverParameterDescriptorImpl]

'result' @ [139:5] ==> var result: Int defined in org.jetbrains.uast.kotlin.psi.getHashCode[LocalVariableDescriptor]

'*' @ [139:14] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'result' @ [139:19] ==> var result: Int defined in org.jetbrains.uast.kotlin.psi.getHashCode[LocalVariableDescriptor]

'containingFile' @ [139:28] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'name' @ [139:43] ==> public final var PsiFile.name: String[MyPropertyDescriptor]

'hashCode' @ [139:48] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'result' @ [140:5] ==> var result: Int defined in org.jetbrains.uast.kotlin.psi.getHashCode[LocalVariableDescriptor]

'*' @ [140:14] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'result' @ [140:19] ==> var result: Int defined in org.jetbrains.uast.kotlin.psi.getHashCode[LocalVariableDescriptor]

'startOffset' @ [140:28] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'result' @ [141:5] ==> var result: Int defined in org.jetbrains.uast.kotlin.psi.getHashCode[LocalVariableDescriptor]

'*' @ [141:14] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'result' @ [141:19] ==> var result: Int defined in org.jetbrains.uast.kotlin.psi.getHashCode[LocalVariableDescriptor]

'text' @ [141:28] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'hashCode' @ [141:33] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'result' @ [142:12] ==> var result: Int defined in org.jetbrains.uast.kotlin.psi.getHashCode[LocalVariableDescriptor]

