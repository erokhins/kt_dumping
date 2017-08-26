'KotlinAbstractUExpression' @ [33:5] ==> public constructor KotlinAbstractUExpression() defined in org.jetbrains.uast.kotlin.KotlinAbstractUExpression[ClassConstructorDescriptorImpl]

'lz' @ [34:41] ==> internal fun <T> lz(initializer: () -> UClass): Lazy<UClass> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> UClass

'psi' @ [35:41] ==> public open val psi: KtObjectLiteralExpression defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression[PropertyDescriptorImpl]

'objectDeclaration' @ [35:45] ==> public final val KtObjectLiteralExpression.objectDeclaration: KtObjectDeclaration[MyPropertyDescriptor]

'toLightClass' @ [35:63] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'if (lightClass != null) {
            getLanguagePlugin().convert<UClass>(lightClass, this)
        }
        else {
            logger.error(
                    "Failed to create light class for object declaration",
                    Attachment(psi.containingFile.virtualFile?.path ?: "<no path>", psi.containingFile.text))

            getLanguagePlugin().convert(LightPsiClassBuilder(psi, "<unnamed>"), this)
        }' @ [36:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UClass, elseBranch: UClass): UClass[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UClass

'lightClass' @ [36:13] ==> val lightClass: KtLightClass? defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression.declaration.<anonymous>[LocalVariableDescriptor]

'getLanguagePlugin' @ [37:13] ==> public tailrec fun UElement.getLanguagePlugin(): UastLanguagePlugin defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]

'convert' @ [37:33] ==> public inline fun <reified T : UElement> UastLanguagePlugin.convert(element: PsiElement, parent: UElement?): UClass defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : UElement> -> UClass

'lightClass' @ [37:49] ==> val lightClass: KtLightClass? defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression.declaration.<anonymous>[LocalVariableDescriptor]

'this' @ [37:61] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression[LazyClassReceiverParameterDescriptor]

'logger' @ [40:13] ==> public final val logger: Logger defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression.Companion[PropertyDescriptorImpl]

'error' @ [40:20] ==> public open fun error(@NonNls p0: (String..String?), @NotNull vararg p1: (Attachment..Attachment?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'Attachment' @ [42:21] ==> public constructor Attachment(@NotNull p0: String, @NotNull p1: String) defined in com.intellij.openapi.diagnostic.Attachment[JavaClassConstructorDescriptor]

'psi' @ [42:32] ==> public open val psi: KtObjectLiteralExpression defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression[PropertyDescriptorImpl]

'containingFile' @ [42:36] ==> public final val KtObjectLiteralExpression.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'virtualFile' @ [42:51] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'path' @ [42:64] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'psi' @ [42:85] ==> public open val psi: KtObjectLiteralExpression defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression[PropertyDescriptorImpl]

'containingFile' @ [42:89] ==> public final val KtObjectLiteralExpression.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'text' @ [42:104] ==> public final val PsiFile.text: (String..String?)[MyPropertyDescriptor]

'getLanguagePlugin' @ [44:13] ==> public tailrec fun UElement.getLanguagePlugin(): UastLanguagePlugin defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]

'convert' @ [44:33] ==> public inline fun <reified T : UElement> UastLanguagePlugin.convert(element: PsiElement, parent: UElement?): UClass defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : UElement> -> UClass

'LightPsiClassBuilder' @ [44:41] ==> public constructor LightPsiClassBuilder(@NotNull p0: PsiElement, @NotNull p1: String) defined in com.intellij.psi.impl.light.LightPsiClassBuilder[JavaClassConstructorDescriptor]

'psi' @ [44:62] ==> public open val psi: KtObjectLiteralExpression defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression[PropertyDescriptorImpl]

'this' @ [44:81] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression[LazyClassReceiverParameterDescriptor]

'psi' @ [48:40] ==> public open val psi: KtObjectLiteralExpression defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression[PropertyDescriptorImpl]

'objectDeclaration' @ [48:44] ==> public final val KtObjectLiteralExpression.objectDeclaration: KtObjectDeclaration[MyPropertyDescriptor]

'toPsiType' @ [48:62] ==> internal fun KtClassOrObject.toPsiType(): PsiType defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'lz' @ [50:46] ==> internal fun <T> lz(initializer: () -> KtSuperTypeCallEntry?): Lazy<KtSuperTypeCallEntry?> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> KtSuperTypeCallEntry?

'psi' @ [51:9] ==> public open val psi: KtObjectLiteralExpression defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression[PropertyDescriptorImpl]

'objectDeclaration' @ [51:13] ==> public final val KtObjectLiteralExpression.objectDeclaration: KtObjectDeclaration[MyPropertyDescriptor]

'superTypeListEntries' @ [51:31] ==> public final val KtObjectDeclaration.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'firstOrNull' @ [51:52] ==> public inline fun <T> Iterable<KtSuperTypeListEntry>.firstOrNull(predicate: (KtSuperTypeListEntry) -> Boolean): KtSuperTypeListEntry? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSuperTypeListEntry

'it' @ [51:66] ==> value-parameter it: KtSuperTypeListEntry defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression.superClassConstructorCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'lz' @ [54:59] ==> internal fun <T> lz(initializer: () -> KotlinUObjectLiteralExpression.ObjectLiteralClassReference?): Lazy<KotlinUObjectLiteralExpression.ObjectLiteralClassReference?> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ObjectLiteralClassReference?

'superClassConstructorCall' @ [54:64] ==> private final val superClassConstructorCall: KtSuperTypeCallEntry? defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression[PropertyDescriptorImpl]

'let' @ [54:91] ==> @InlineOnly public inline fun <T, R> KtSuperTypeCallEntry.let(block: (KtSuperTypeCallEntry) -> KotlinUObjectLiteralExpression.ObjectLiteralClassReference): KotlinUObjectLiteralExpression.ObjectLiteralClassReference defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSuperTypeCallEntry
    <R> -> ObjectLiteralClassReference

'ObjectLiteralClassReference' @ [54:97] ==> public constructor ObjectLiteralClassReference(psi: KtSuperTypeCallEntry, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression.ObjectLiteralClassReference[ClassConstructorDescriptorImpl]

'it' @ [54:125] ==> value-parameter it: KtSuperTypeCallEntry defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression.classReference.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [54:129] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression[LazyClassReceiverParameterDescriptor]

'superClassConstructorCall' @ [57:17] ==> private final val superClassConstructorCall: KtSuperTypeCallEntry? defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression[PropertyDescriptorImpl]

'valueArguments' @ [57:44] ==> public final val KtSuperTypeCallEntry.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'size' @ [57:60] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'lz' @ [59:36] ==> internal fun <T> lz(initializer: () -> List<UExpression>): Lazy<List<UExpression>> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<UExpression>

'superClassConstructorCall' @ [60:19] ==> private final val superClassConstructorCall: KtSuperTypeCallEntry? defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression[PropertyDescriptorImpl]

'emptyList' @ [60:58] ==> public fun <T> emptyList(): List<UExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UExpression

'psi' @ [61:9] ==> val psi: KtSuperTypeCallEntry defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression.valueArguments.<anonymous>[LocalVariableDescriptor]

'valueArguments' @ [61:13] ==> public final val KtSuperTypeCallEntry.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'map' @ [61:28] ==> public inline fun <T, R> Iterable<(ValueArgument..ValueArgument?)>.map(transform: ((ValueArgument..ValueArgument?)) -> UExpression): List<UExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)
    <R> -> UExpression

'KotlinConverter' @ [61:34] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'convertOrEmpty' @ [61:50] ==> internal final fun convertOrEmpty(expression: KtExpression?, parent: UElement?): UExpression defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'it' @ [61:65] ==> value-parameter it: (ValueArgument..ValueArgument?) defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression.valueArguments.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [61:68] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'this' @ [61:93] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression[LazyClassReceiverParameterDescriptor]

'superClassConstructorCall' @ [65:17] ==> private final val superClassConstructorCall: KtSuperTypeCallEntry? defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression[PropertyDescriptorImpl]

'typeArguments' @ [65:44] ==> public final val KtSuperTypeCallEntry.typeArguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'size' @ [65:59] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'lz' @ [67:35] ==> internal fun <T> lz(initializer: () -> List<PsiType>): Lazy<List<PsiType>> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<PsiType>

'superClassConstructorCall' @ [68:19] ==> private final val superClassConstructorCall: KtSuperTypeCallEntry? defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression[PropertyDescriptorImpl]

'emptyList' @ [68:58] ==> public fun <T> emptyList(): List<PsiType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiType

'psi' @ [69:9] ==> val psi: KtSuperTypeCallEntry defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression.typeArguments.<anonymous>[LocalVariableDescriptor]

'typeArguments' @ [69:13] ==> public final val KtSuperTypeCallEntry.typeArguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'map' @ [69:27] ==> public inline fun <T, R> Iterable<(KtTypeProjection..KtTypeProjection?)>.map(transform: ((KtTypeProjection..KtTypeProjection?)) -> PsiType): List<PsiType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeProjection..org.jetbrains.kotlin.psi.KtTypeProjection?)
    <R> -> PsiType

'it' @ [69:33] ==> value-parameter it: (KtTypeProjection..KtTypeProjection?) defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression.typeArguments.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'typeReference' @ [69:36] ==> public final val KtTypeProjection.typeReference: KtTypeReference?[MyPropertyDescriptor]

'toPsiType' @ [69:50] ==> internal fun KtTypeReference?.toPsiType(source: UElement, boxed: Boolean = ...): PsiType defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [69:60] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression[LazyClassReceiverParameterDescriptor]

'superClassConstructorCall' @ [72:30] ==> private final val superClassConstructorCall: KtSuperTypeCallEntry? defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression[PropertyDescriptorImpl]

'resolveCallToDeclaration' @ [72:57] ==> internal fun KtElement.resolveCallToDeclaration(context: KotlinAbstractUElement, resultingDescriptor: DeclarationDescriptor? = ...): PsiElement? defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [72:82] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression[LazyClassReceiverParameterDescriptor]

'KotlinAbstractUElement' @ [77:9] ==> public constructor KotlinAbstractUElement() defined in org.jetbrains.uast.kotlin.KotlinAbstractUElement[ClassConstructorDescriptorImpl]

'psi' @ [78:35] ==> public open val psi: KtSuperTypeCallEntry defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression.ObjectLiteralClassReference[PropertyDescriptorImpl]

'resolveCallToDeclaration' @ [78:39] ==> internal fun KtElement.resolveCallToDeclaration(context: KotlinAbstractUElement, resultingDescriptor: DeclarationDescriptor? = ...): PsiElement? defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [78:64] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression.ObjectLiteralClassReference[LazyClassReceiverParameterDescriptor]

'containingClass' @ [78:86] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'emptyList' @ [81:21] ==> public fun <T> emptyList(): List<UAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UAnnotation

'identifier' @ [84:21] ==> public open val identifier: String defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression.ObjectLiteralClassReference[PropertyDescriptorImpl]

'psi' @ [87:21] ==> public open val psi: KtSuperTypeCallEntry defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression.ObjectLiteralClassReference[PropertyDescriptorImpl]

'name' @ [87:25] ==> public final val KtSuperTypeCallEntry.name: String?[MyPropertyDescriptor]

'lz' @ [91:23] ==> internal fun <T> lz(initializer: () -> Logger): Lazy<Logger> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Logger

'getInstance' @ [91:35] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'KotlinUObjectLiteralExpression' @ [91:47] ==> public companion object defined in org.jetbrains.uast.kotlin.KotlinUObjectLiteralExpression[FakeCallableDescriptorForObject]

'java' @ [91:85] ==> public val <T> KClass<KotlinUObjectLiteralExpression>.java: Class<KotlinUObjectLiteralExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinUObjectLiteralExpression

