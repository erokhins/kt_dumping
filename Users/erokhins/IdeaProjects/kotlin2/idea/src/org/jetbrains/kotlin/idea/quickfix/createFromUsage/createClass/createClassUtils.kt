'isNotEmpty' @ [50:49] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'isUpperCase' @ [50:75] ==> public open fun isUpperCase(p0: Char): Boolean defined in java.lang.Character[JavaMethodDescriptor]

'first' @ [50:87] ==> public fun CharSequence.first(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'isNotEmpty' @ [52:50] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'isLowerCase' @ [52:76] ==> public open fun isLowerCase(p0: Char): Boolean defined in java.lang.Character[JavaMethodDescriptor]

'first' @ [52:88] ==> public fun CharSequence.first(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'element' @ [59:16] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByQualifier[ValueParameterDescriptorImpl]

'containingKtFile' @ [59:24] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'file' @ [60:19] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByQualifier[LocalVariableDescriptor]

'project' @ [60:24] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'when {
        !isQualified ->
            element.parents.filterIsInstance<KtClassOrObject>().toList() + file
        qualifierDescriptor is ClassDescriptor ->
            listOfNotNull(DescriptorToSourceUtilsIde.getAnyDeclaration(project, qualifierDescriptor))
        qualifierDescriptor is PackageViewDescriptor ->
            if (qualifierDescriptor.fqName != file.packageFqName) {
                listOfNotNull(JavaPsiFacade.getInstance(project).findPackage(qualifierDescriptor.fqName.asString()))
            }
            else listOf(file)
        else ->
            emptyList()
    }' @ [61:43] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<PsiElement>, entry1: List<PsiElement>, entry2: List<PsiElement>, entry3: List<PsiElement>): List<PsiElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<PsiElement>

'!' @ [62:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isQualified' @ [62:10] ==> value-parameter isQualified: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByQualifier[ValueParameterDescriptorImpl]

'element' @ [63:13] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByQualifier[ValueParameterDescriptorImpl]

'parents' @ [63:21] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'filterIsInstance' @ [63:29] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<KtClassOrObject> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtClassOrObject

'toList' @ [63:65] ==> public fun <T> Sequence<KtClassOrObject>.toList(): List<KtClassOrObject> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'file' @ [63:76] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByQualifier[LocalVariableDescriptor]

'qualifierDescriptor' @ [64:9] ==> value-parameter qualifierDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByQualifier[ValueParameterDescriptorImpl]

'listOfNotNull' @ [65:13] ==> public fun <T : Any> listOfNotNull(element: PsiElement?): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PsiElement

'getAnyDeclaration' @ [65:54] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [65:72] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByQualifier[LocalVariableDescriptor]

'qualifierDescriptor' @ [65:81] ==> value-parameter qualifierDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByQualifier[ValueParameterDescriptorImpl]

'qualifierDescriptor' @ [66:9] ==> value-parameter qualifierDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByQualifier[ValueParameterDescriptorImpl]

'if (qualifierDescriptor.fqName != file.packageFqName) {
                listOfNotNull(JavaPsiFacade.getInstance(project).findPackage(qualifierDescriptor.fqName.asString()))
            }
            else listOf(file)' @ [67:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<PsiElement>, elseBranch: List<PsiElement>): List<PsiElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<PsiElement>

'qualifierDescriptor' @ [67:17] ==> value-parameter qualifierDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByQualifier[ValueParameterDescriptorImpl]

'fqName' @ [67:37] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'file' @ [67:47] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByQualifier[LocalVariableDescriptor]

'packageFqName' @ [67:52] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'listOfNotNull' @ [68:17] ==> public fun <T : Any> listOfNotNull(element: PsiPackage?): List<PsiPackage> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PsiPackage

'getInstance' @ [68:45] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [68:57] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByQualifier[LocalVariableDescriptor]

'findPackage' @ [68:66] ==> @Nullable public abstract fun findPackage(@NonNls @NotNull p0: String): PsiPackage? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'qualifierDescriptor' @ [68:78] ==> value-parameter qualifierDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByQualifier[ValueParameterDescriptorImpl]

'fqName' @ [68:98] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'asString' @ [68:105] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'listOf' @ [70:18] ==> public fun <T> listOf(element: KtFile): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'file' @ [70:25] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByQualifier[LocalVariableDescriptor]

'emptyList' @ [72:13] ==> public fun <T> emptyList(): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'targetParents' @ [74:12] ==> val targetParents: List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByQualifier[LocalVariableDescriptor]

'filter' @ [74:26] ==> public inline fun <T> Iterable<PsiElement>.filter(predicate: (PsiElement) -> Boolean): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [74:35] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByQualifier.<anonymous>[ValueParameterDescriptorImpl]

'canRefactor' @ [74:38] ==> public fun PsiElement.canRefactor(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'call' @ [78:23] ==> value-parameter call: Call defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByCall[ValueParameterDescriptorImpl]

'callElement' @ [78:28] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'call' @ [79:20] ==> value-parameter call: Call defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByCall[ValueParameterDescriptorImpl]

'explicitReceiver' @ [79:25] ==> public final val Call.explicitReceiver: Receiver?[MyPropertyDescriptor]

'when (receiver) {
        null -> getTargetParentsByQualifier(callElement, false, null)
        is Qualifier -> getTargetParentsByQualifier(callElement, true, context[BindingContext.REFERENCE_TARGET, receiver.referenceExpression])
        is ReceiverValue -> getTargetParentsByQualifier(callElement, true, receiver.type.constructor.declarationDescriptor)
        else -> throw AssertionError("Unexpected receiver: $receiver")
    }' @ [80:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<PsiElement>, entry1: List<PsiElement>, entry2: List<PsiElement>, entry3: List<PsiElement>): List<PsiElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<PsiElement>

'receiver' @ [80:18] ==> val receiver: Receiver? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByCall[LocalVariableDescriptor]

'getTargetParentsByQualifier' @ [81:17] ==> internal fun getTargetParentsByQualifier(element: KtElement, isQualified: Boolean, qualifierDescriptor: DeclarationDescriptor?): List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass in file createClassUtils.kt[SimpleFunctionDescriptorImpl]

'callElement' @ [81:45] ==> val callElement: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByCall[LocalVariableDescriptor]

'getTargetParentsByQualifier' @ [82:25] ==> internal fun getTargetParentsByQualifier(element: KtElement, isQualified: Boolean, qualifierDescriptor: DeclarationDescriptor?): List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass in file createClassUtils.kt[SimpleFunctionDescriptorImpl]

'callElement' @ [82:53] ==> val callElement: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByCall[LocalVariableDescriptor]

'context' @ [82:72] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByCall[ValueParameterDescriptorImpl]

'REFERENCE_TARGET' @ [82:95] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'receiver' @ [82:113] ==> val receiver: Receiver? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByCall[LocalVariableDescriptor]

'referenceExpression' @ [82:122] ==> public abstract val referenceExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.Qualifier[DeserializedPropertyDescriptor]

'getTargetParentsByQualifier' @ [83:29] ==> internal fun getTargetParentsByQualifier(element: KtElement, isQualified: Boolean, qualifierDescriptor: DeclarationDescriptor?): List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass in file createClassUtils.kt[SimpleFunctionDescriptorImpl]

'callElement' @ [83:57] ==> val callElement: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByCall[LocalVariableDescriptor]

'receiver' @ [83:76] ==> val receiver: Receiver? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByCall[LocalVariableDescriptor]

'type' @ [83:85] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [83:90] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [83:102] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'AssertionError' @ [84:23] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'receiver' @ [84:61] ==> val receiver: Receiver? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTargetParentsByCall[LocalVariableDescriptor]

'call' @ [88:49] ==> value-parameter call: Call defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.isInnerClassExpected[ValueParameterDescriptorImpl]

'explicitReceiver' @ [88:54] ==> public final val Call.explicitReceiver: Receiver?[MyPropertyDescriptor]

'guessTypes' @ [91:9] ==> public fun KtExpression.guessTypes(context: BindingContext, module: ModuleDescriptor, pseudocode: Pseudocode? = ..., coerceUnusedToUnit: Boolean = ..., allowErrorTypes: Boolean = ...): Array<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'context' @ [91:20] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.guessTypeForClass[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [91:29] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.guessTypeForClass[ValueParameterDescriptorImpl]

'singleOrNull' @ [91:75] ==> public fun <T> Array<out KotlinType>.singleOrNull(): KotlinType? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'ByType' @ [94:21] ==> public constructor ByType(theType: KotlinType, variance: Variance) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByType[ClassConstructorDescriptorImpl]

'this' @ [94:28] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.toClassTypeInfo[ReceiverParameterDescriptorImpl]

'OUT_VARIANCE' @ [94:43] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'noSubstitutions' @ [94:57] ==> public fun TypeInfo.noSubstitutions(): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'expectedType' @ [98:22] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getClassKindFilter[ValueParameterDescriptorImpl]

'constructor' @ [98:35] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [98:47] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'!' @ [100:27] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expectedType' @ [100:29] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getClassKindFilter[ValueParameterDescriptorImpl]

'constructor' @ [100:42] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'isFinal' @ [100:54] ==> public final val TypeConstructor.isFinal: Boolean[MyPropertyDescriptor]

'expectedType' @ [100:65] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getClassKindFilter[ValueParameterDescriptorImpl]

'containsStarProjections' @ [100:78] ==> public fun KotlinType.containsStarProjections(): Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'isEnumClass' @ [101:34] ==> public open fun isEnumClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [101:46] ==> val descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getClassKindFilter[LocalVariableDescriptor]

'!' @ [103:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canHaveSubtypes' @ [103:11] ==> val canHaveSubtypes: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getClassKindFilter[LocalVariableDescriptor]

'isEnum' @ [103:30] ==> val isEnum: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getClassKindFilter[LocalVariableDescriptor]

'descriptor' @ [104:12] ==> val descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getClassKindFilter[LocalVariableDescriptor]

'when (classKind) {
            ClassKind.ENUM_ENTRY -> isEnum && containingDeclaration == DescriptorToSourceUtils.descriptorToDeclaration(descriptor)
            ClassKind.INTERFACE -> containingDeclaration !is PsiClass
                                   || (descriptor as? ClassDescriptor)?.kind == ClassDescriptorKind.INTERFACE
            else -> canHaveSubtypes
        }' @ [107:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'classKind' @ [107:15] ==> value-parameter classKind: ClassKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getClassKindFilter.<anonymous>[ValueParameterDescriptorImpl]

'ENUM_ENTRY' @ [108:23] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'isEnum' @ [108:37] ==> val isEnum: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getClassKindFilter[LocalVariableDescriptor]

'containingDeclaration' @ [108:47] ==> value-parameter containingDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getClassKindFilter[ValueParameterDescriptorImpl]

'descriptorToDeclaration' @ [108:96] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [108:120] ==> val descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getClassKindFilter[LocalVariableDescriptor]

'INTERFACE' @ [109:23] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'containingDeclaration' @ [109:36] ==> value-parameter containingDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getClassKindFilter[ValueParameterDescriptorImpl]

'==' @ [110:39] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.ClassKind[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [110:40] ==> val descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getClassKindFilter[LocalVariableDescriptor]

'kind' @ [110:73] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [110:101] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'canHaveSubtypes' @ [111:21] ==> val canHaveSubtypes: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getClassKindFilter[LocalVariableDescriptor]

'getReferencedName' @ [117:16] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'!' @ [118:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'name' @ [118:10] ==> val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getCreatePackageFixIfApplicable[LocalVariableDescriptor]

'checkPackageName' @ [118:15] ==> private fun String.checkPackageName(): Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass in file createClassUtils.kt[SimpleFunctionDescriptorImpl]

'when (targetParent) {
                is KtFile -> JavaPsiFacade.getInstance(targetParent.project).findPackage(targetParent.packageFqName.asString())
                is PsiPackage -> targetParent
                else -> null
            }' @ [121:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiPackage?, entry1: PsiPackage?, entry2: PsiPackage?): PsiPackage?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiPackage?

'targetParent' @ [121:19] ==> value-parameter targetParent: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getCreatePackageFixIfApplicable[ValueParameterDescriptorImpl]

'getInstance' @ [122:44] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'targetParent' @ [122:56] ==> value-parameter targetParent: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getCreatePackageFixIfApplicable[ValueParameterDescriptorImpl]

'project' @ [122:69] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'findPackage' @ [122:78] ==> @Nullable public abstract fun findPackage(@NonNls @NotNull p0: String): PsiPackage? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'targetParent' @ [122:90] ==> value-parameter targetParent: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getCreatePackageFixIfApplicable[ValueParameterDescriptorImpl]

'packageFqName' @ [122:103] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'asString' @ [122:117] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'targetParent' @ [123:34] ==> value-parameter targetParent: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getCreatePackageFixIfApplicable[ValueParameterDescriptorImpl]

'basePackage' @ [128:20] ==> val basePackage: PsiPackage defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getCreatePackageFixIfApplicable[LocalVariableDescriptor]

'qualifiedName' @ [128:32] ==> public final val PsiPackage.qualifiedName: String[MyPropertyDescriptor]

'if (baseName.isNotEmpty()) "$baseName.$name" else name' @ [129:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'baseName' @ [129:24] ==> val baseName: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getCreatePackageFixIfApplicable[LocalVariableDescriptor]

'isNotEmpty' @ [129:33] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'baseName' @ [129:49] ==> val baseName: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getCreatePackageFixIfApplicable[LocalVariableDescriptor]

'name' @ [129:59] ==> val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getCreatePackageFixIfApplicable[LocalVariableDescriptor]

'name' @ [129:70] ==> val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getCreatePackageFixIfApplicable[LocalVariableDescriptor]

'?:' @ [131:19] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: CreateClassOrPackageFix?, right: CreateClassOrPackageFix): CreateClassOrPackageFix[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> CreateClassOrPackageFix

'createFix' @ [131:43] ==> @Nullable public open fun createFix(@NotNull p0: String, @NotNull p1: GlobalSearchScope, @NotNull p2: PsiElement, @Nullable p3: PsiPackage?, @Nullable p4: ClassKind?, @Nullable p5: String?, @Nullable p6: String?): CreateClassOrPackageFix? defined in com.intellij.codeInsight.daemon.quickFix.CreateClassOrPackageFix[JavaMethodDescriptor]

'fullName' @ [131:53] ==> val fullName: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getCreatePackageFixIfApplicable[LocalVariableDescriptor]

'resolveScope' @ [131:63] ==> public final val KtSimpleNameExpression.resolveScope: GlobalSearchScope[MyPropertyDescriptor]

'this' @ [131:77] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getCreatePackageFixIfApplicable[ReceiverParameterDescriptorImpl]

'basePackage' @ [131:83] ==> val basePackage: PsiPackage defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getCreatePackageFixIfApplicable[LocalVariableDescriptor]

'DelegatingIntentionAction' @ [133:21] ==> public constructor DelegatingIntentionAction(delegate: IntentionAction) defined in org.jetbrains.kotlin.idea.quickfix.DelegatingIntentionAction[ClassConstructorDescriptorImpl]

'javaFix' @ [133:47] ==> val javaFix: CreateClassOrPackageFix defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getCreatePackageFixIfApplicable[LocalVariableDescriptor]

'message' @ [134:61] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'fullName' @ [136:60] ==> val fullName: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getCreatePackageFixIfApplicable[LocalVariableDescriptor]

'LinkedHashMap' @ [146:35] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> TypeConstructor
    <V : (Any..Any?)> -> TypeProjection

'apply' @ [146:84] ==> @InlineOnly public inline fun <T> LinkedHashMap<TypeConstructor, TypeProjection>.apply(block: LinkedHashMap<TypeConstructor, TypeProjection>.() -> Unit): LinkedHashMap<TypeConstructor, TypeProjection> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LinkedHashMap<TypeConstructor, TypeProjection>

'this' @ [147:13] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.UnsubstitutedTypeConstraintInfo.performSubstitution.<anonymous>[ReceiverParameterDescriptorImpl]

'putAll' @ [147:18] ==> public open fun putAll(from: Map<out TypeConstructor, TypeProjection>): Unit defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'originalSubstitution' @ [147:25] ==> private final val originalSubstitution: Map<TypeConstructor, TypeProjection> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.UnsubstitutedTypeConstraintInfo[PropertyDescriptorImpl]

'this' @ [148:13] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.UnsubstitutedTypeConstraintInfo.performSubstitution.<anonymous>[ReceiverParameterDescriptorImpl]

'putAll' @ [148:18] ==> public fun <K, V> MutableMap<in TypeConstructor, in TypeProjection>.putAll(pairs: Array<out Pair<TypeConstructor, TypeProjection>>): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeConstructor
    <V> -> TypeProjection

'substitution' @ [148:25] ==> value-parameter vararg substitution: Pair<TypeConstructor, TypeProjection> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.UnsubstitutedTypeConstraintInfo.performSubstitution[ValueParameterDescriptorImpl]

'?:' @ [150:37] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KotlinType?, right: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KotlinType

'create' @ [150:53] ==> @NotNull public open fun create(@NotNull p0: (MutableMap<(TypeConstructor..TypeConstructor?), (TypeProjection..TypeProjection?)>..Map<(TypeConstructor..TypeConstructor?), (TypeProjection..TypeProjection?)>)): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'currentSubstitution' @ [150:60] ==> val currentSubstitution: LinkedHashMap<TypeConstructor, TypeProjection> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.UnsubstitutedTypeConstraintInfo.performSubstitution[LocalVariableDescriptor]

'substitute' @ [150:81] ==> @Nullable public open fun substitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType? defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'upperBound' @ [150:92] ==> public final val upperBound: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.UnsubstitutedTypeConstraintInfo[PropertyDescriptorImpl]

'INVARIANT' @ [150:113] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'TypeConstraintInfo' @ [151:16] ==> public constructor TypeConstraintInfo(typeParameter: TypeParameterDescriptor, upperBound: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.TypeConstraintInfo[ClassConstructorDescriptorImpl]

'typeParameter' @ [151:35] ==> public final val typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.UnsubstitutedTypeConstraintInfo[PropertyDescriptorImpl]

'substitutedUpperBound' @ [151:50] ==> val substitutedUpperBound: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.UnsubstitutedTypeConstraintInfo.performSubstitution[LocalVariableDescriptor]

'element' @ [161:19] ==> value-parameter element: KtTypeElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getUnsubstitutedTypeConstraintInfo[ValueParameterDescriptorImpl]

'analyze' @ [161:27] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [161:51] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'?:' @ [162:29] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtTypeProjection?, right: KtTypeProjection): KtTypeProjection[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtTypeProjection

'element' @ [162:30] ==> value-parameter element: KtTypeElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getUnsubstitutedTypeConstraintInfo[ValueParameterDescriptorImpl]

'parent' @ [162:38] ==> public final val KtTypeElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [162:67] ==> public final val KtTypeReference.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'containingTypeArg' @ [163:24] ==> val containingTypeArg: KtTypeProjection defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getUnsubstitutedTypeConstraintInfo[LocalVariableDescriptor]

'parent' @ [163:42] ==> public final val KtTypeProjection.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'?:' @ [164:29] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtTypeReference?, right: KtTypeReference): KtTypeReference[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtTypeReference

'argumentList' @ [164:30] ==> val argumentList: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getUnsubstitutedTypeConstraintInfo[LocalVariableDescriptor]

'parent' @ [164:43] ==> public final val KtTypeArgumentList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [164:70] ==> public final val KtTypeElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'containingTypeRef' @ [165:26] ==> val containingTypeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getUnsubstitutedTypeConstraintInfo[LocalVariableDescriptor]

'getAbbreviatedTypeOrType' @ [165:44] ==> public fun KtTypeReference.getAbbreviatedTypeOrType(context: BindingContext): KotlinType? defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [165:69] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getUnsubstitutedTypeConstraintInfo[LocalVariableDescriptor]

'containingType' @ [166:20] ==> val containingType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getUnsubstitutedTypeConstraintInfo[LocalVariableDescriptor]

'constructor' @ [166:35] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [166:47] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'defaultType' @ [166:70] ==> public final val ClassifierDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'containingType' @ [167:25] ==> val containingType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getUnsubstitutedTypeConstraintInfo[LocalVariableDescriptor]

'constructor' @ [167:40] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'parameters' @ [167:52] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'getOrNull' @ [167:63] ==> public fun <T> List<(TypeParameterDescriptor..TypeParameterDescriptor?)>.getOrNull(index: Int): TypeParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'argumentList' @ [167:73] ==> val argumentList: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getUnsubstitutedTypeConstraintInfo[LocalVariableDescriptor]

'arguments' @ [167:86] ==> public final val KtTypeArgumentList.arguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'indexOf' @ [167:96] ==> public abstract fun indexOf(element: (KtTypeProjection..KtTypeProjection?)): Int defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'containingTypeArg' @ [167:104] ==> val containingTypeArg: KtTypeProjection defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getUnsubstitutedTypeConstraintInfo[LocalVariableDescriptor]

'typeParameter' @ [168:22] ==> val typeParameter: TypeParameterDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getUnsubstitutedTypeConstraintInfo[LocalVariableDescriptor]

'upperBounds' @ [168:37] ==> public final val TypeParameterDescriptor.upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)[MyPropertyDescriptor]

'singleOrNull' @ [168:50] ==> public fun <T> List<(KotlinType..KotlinType?)>.singleOrNull(): KotlinType? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'getTypeSubstitution' @ [169:24] ==> public fun getTypeSubstitution(baseType: KotlinType, derivedType: KotlinType): LinkedHashMap<TypeConstructor, TypeProjection>? defined in org.jetbrains.kotlin.types.substitutions[DeserializedSimpleFunctionDescriptor]

'baseType' @ [169:44] ==> val baseType: SimpleType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getUnsubstitutedTypeConstraintInfo[LocalVariableDescriptor]

'containingType' @ [169:54] ==> val containingType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getUnsubstitutedTypeConstraintInfo[LocalVariableDescriptor]

'UnsubstitutedTypeConstraintInfo' @ [170:12] ==> public constructor UnsubstitutedTypeConstraintInfo(typeParameter: TypeParameterDescriptor, originalSubstitution: Map<TypeConstructor, TypeProjection>, upperBound: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.UnsubstitutedTypeConstraintInfo[ClassConstructorDescriptorImpl]

'typeParameter' @ [170:44] ==> val typeParameter: TypeParameterDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getUnsubstitutedTypeConstraintInfo[LocalVariableDescriptor]

'substitution' @ [170:59] ==> val substitution: LinkedHashMap<TypeConstructor, TypeProjection> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getUnsubstitutedTypeConstraintInfo[LocalVariableDescriptor]

'upperBound' @ [170:73] ==> val upperBound: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getUnsubstitutedTypeConstraintInfo[LocalVariableDescriptor]

'getUnsubstitutedTypeConstraintInfo' @ [173:53] ==> public fun getUnsubstitutedTypeConstraintInfo(element: KtTypeElement): UnsubstitutedTypeConstraintInfo? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass in file createClassUtils.kt[SimpleFunctionDescriptorImpl]

'element' @ [173:88] ==> value-parameter element: KtTypeElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.getTypeConstraintInfo[ValueParameterDescriptorImpl]

'performSubstitution' @ [173:98] ==> public final fun performSubstitution(vararg substitution: Pair<TypeConstructor, TypeProjection>): TypeConstraintInfo? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.UnsubstitutedTypeConstraintInfo[SimpleFunctionDescriptorImpl]

