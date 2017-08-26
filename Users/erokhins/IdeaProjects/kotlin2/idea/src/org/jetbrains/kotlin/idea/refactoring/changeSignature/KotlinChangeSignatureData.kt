'receiver' @ [48:9] ==> public open val receiver: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'createReceiverInfoIfNeeded' @ [48:20] ==> private final fun createReceiverInfoIfNeeded(): KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[SimpleFunctionDescriptorImpl]

'when (baseDeclaration) {
            is KtFunction -> baseDeclaration.valueParameters
            is KtClass -> baseDeclaration.primaryConstructorParameters
            else -> null
        }' @ [50:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (List<KtParameter>?..List<(KtParameter..KtParameter?)>?), entry1: (List<KtParameter>?..List<(KtParameter..KtParameter?)>?), entry2: (List<KtParameter>?..List<(KtParameter..KtParameter?)>?)): (List<KtParameter>?..List<(KtParameter..KtParameter?)>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.collections.List<org.jetbrains.kotlin.psi.KtParameter>?..kotlin.collections.List<(org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)>?)

'baseDeclaration' @ [50:37] ==> public open val baseDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'baseDeclaration' @ [51:30] ==> public open val baseDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'valueParameters' @ [51:46] ==> public final val KtFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'baseDeclaration' @ [52:27] ==> public open val baseDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'primaryConstructorParameters' @ [52:43] ==> public final val KtClass.primaryConstructorParameters: List<KtParameter>[MyPropertyDescriptor]

'parameters' @ [55:9] ==> private final val parameters: List<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'baseDescriptor' @ [55:22] ==> public open val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'valueParameters' @ [55:37] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'mapTo' @ [56:18] ==> public inline fun <T, R, C : MutableCollection<in KotlinParameterInfo>> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.mapTo(destination: ArrayList<KotlinParameterInfo> /* = ArrayList<KotlinParameterInfo> */, transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> KotlinParameterInfo): ArrayList<KotlinParameterInfo> /* = ArrayList<KotlinParameterInfo> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> KotlinParameterInfo
    <C : MutableCollection<in R>> -> ArrayList<KotlinParameterInfo>

'receiver' @ [56:24] ==> public open val receiver: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'let' @ [56:34] ==> @InlineOnly public inline fun <T, R> KotlinParameterInfo.let(block: (KotlinParameterInfo) -> ArrayList<KotlinParameterInfo> /* = ArrayList<KotlinParameterInfo> */): ArrayList<KotlinParameterInfo> /* = ArrayList<KotlinParameterInfo> */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinParameterInfo
    <R> -> ArrayList<KotlinParameterInfo>

'arrayListOf' @ [56:39] ==> public fun <T> arrayListOf(vararg elements: KotlinParameterInfo): ArrayList<KotlinParameterInfo> /* = ArrayList<KotlinParameterInfo> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinParameterInfo

'it' @ [56:51] ==> value-parameter it: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.<init>.<anonymous>[ValueParameterDescriptorImpl]

'arrayListOf' @ [56:60] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<KotlinParameterInfo> /* = ArrayList<KotlinParameterInfo> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinParameterInfo

'valueParameters' @ [57:40] ==> val valueParameters: (List<KtParameter>?..List<(KtParameter..KtParameter?)>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.<init>[LocalVariableDescriptor]

'get' @ [57:57] ==> public abstract operator fun get(index: Int): KtParameter defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'parameterDescriptor' @ [57:61] ==> value-parameter parameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.<init>.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [57:81] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'parameterDescriptor' @ [58:41] ==> value-parameter parameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.<init>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [58:61] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'jetParameter' @ [59:45] ==> val jetParameter: KtParameter? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.<init>.<anonymous>[LocalVariableDescriptor]

'typeReference' @ [59:59] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'text' @ [59:74] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [60:71] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [60:104] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'parameterType' @ [60:115] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.<init>.<anonymous>[LocalVariableDescriptor]

'KotlinParameterInfo' @ [61:21] ==> @JvmOverloads public constructor KotlinParameterInfo(callableDescriptor: CallableDescriptor, originalIndex: Int = ..., name: String, originalTypeInfo: KotlinTypeInfo = ..., defaultValueForParameter: KtExpression? = ..., defaultValueForCall: KtExpression? = ..., valOrVar: KotlinValVar = ..., modifierList: KtModifierList? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[ClassConstructorDescriptorImpl]

'baseDescriptor' @ [62:50] ==> public open val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'parameterDescriptor' @ [63:45] ==> value-parameter parameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.<init>.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [63:65] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'parameterDescriptor' @ [64:36] ==> value-parameter parameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.<init>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [64:56] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [64:61] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'KotlinTypeInfo' @ [65:48] ==> public constructor KotlinTypeInfo(isCovariant: Boolean, type: KotlinType? = ..., text: String? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'parameterType' @ [65:70] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.<init>.<anonymous>[LocalVariableDescriptor]

'parameterTypeText' @ [65:85] ==> val parameterTypeText: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.<init>.<anonymous>[LocalVariableDescriptor]

'jetParameter' @ [66:56] ==> val jetParameter: KtParameter? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.<init>.<anonymous>[LocalVariableDescriptor]

'defaultValue' @ [66:70] ==> public final val KtParameter.defaultValue: KtExpression?[MyPropertyDescriptor]

'jetParameter' @ [67:40] ==> val jetParameter: KtParameter? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.<init>.<anonymous>[LocalVariableDescriptor]

'valOrVarKeyword' @ [67:54] ==> public final val KtParameter.valOrVarKeyword: PsiElement?[MyPropertyDescriptor]

'toValVar' @ [67:70] ==> public fun PsiElement?.toValVar(): KotlinValVar defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinValVar.kt[SimpleFunctionDescriptorImpl]

'baseDescriptor' @ [73:28] ==> public open val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'extensionReceiverParameter' @ [73:43] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [73:71] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'suggestReceiverNames' @ [74:28] ==> public fun suggestReceiverNames(project: Project, descriptor: CallableDescriptor): List<String> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file changeSignatureUtils.kt[SimpleFunctionDescriptorImpl]

'baseDeclaration' @ [74:49] ==> public open val baseDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'project' @ [74:65] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'baseDescriptor' @ [74:74] ==> public open val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'first' @ [74:90] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'?:' @ [75:32] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'baseDeclaration' @ [75:33] ==> public open val baseDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'receiverTypeReference' @ [75:77] ==> public final val KtCallableDeclaration.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'text' @ [75:100] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [76:58] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [76:91] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'receiverType' @ [76:102] ==> val receiverType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.createReceiverInfoIfNeeded[LocalVariableDescriptor]

'KotlinParameterInfo' @ [77:16] ==> @JvmOverloads public constructor KotlinParameterInfo(callableDescriptor: CallableDescriptor, originalIndex: Int = ..., name: String, originalTypeInfo: KotlinTypeInfo = ..., defaultValueForParameter: KtExpression? = ..., defaultValueForCall: KtExpression? = ..., valOrVar: KotlinValVar = ..., modifierList: KtModifierList? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[ClassConstructorDescriptorImpl]

'baseDescriptor' @ [77:57] ==> public open val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'receiverName' @ [78:43] ==> val receiverName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.createReceiverInfoIfNeeded[LocalVariableDescriptor]

'KotlinTypeInfo' @ [79:55] ==> public constructor KotlinTypeInfo(isCovariant: Boolean, type: KotlinType? = ..., text: String? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'receiverType' @ [79:77] ==> val receiverType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.createReceiverInfoIfNeeded[LocalVariableDescriptor]

'receiverTypeText' @ [79:91] ==> val receiverTypeText: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.createReceiverInfoIfNeeded[LocalVariableDescriptor]

'this' @ [83:17] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[LazyClassReceiverParameterDescriptor]

'getValue' @ [85:93] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'descriptorsForSignatureChange' @ [86:9] ==> private final val descriptorsForSignatureChange: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'map' @ [86:39] ==> public inline fun <T, R> Iterable<CallableDescriptor>.map(transform: (CallableDescriptor) -> KotlinCallableDefinitionUsage<PsiElement>): List<KotlinCallableDefinitionUsage<PsiElement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor
    <R> -> KotlinCallableDefinitionUsage<PsiElement>

'DescriptorToSourceUtilsIde' @ [87:31] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [87:58] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'baseDeclaration' @ [87:76] ==> public open val baseDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'project' @ [87:92] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'it' @ [87:101] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.primaryCallables.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assert' @ [88:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'declaration' @ [88:20] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.primaryCallables.<anonymous>.<anonymous>[LocalVariableDescriptor]

'+' @ [88:43] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'baseDescriptor' @ [88:73] ==> public open val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'KotlinCallableDefinitionUsage' @ [89:13] ==> public constructor KotlinCallableDefinitionUsage<T : PsiElement>(function: PsiElement, originalCallableDescriptor: CallableDescriptor, baseFunction: KotlinCallableDefinitionUsage<PsiElement>?, samCallType: KotlinType?, canDropOverride: Boolean = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> PsiElement

'declaration' @ [89:43] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.primaryCallables.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [89:58] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.primaryCallables.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getValue' @ [93:88] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'primaryCallables' @ [94:9] ==> public open val primaryCallables: Collection<KotlinCallableDefinitionUsage<PsiElement>> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'first' @ [94:26] ==> public inline fun <T> Iterable<KotlinCallableDefinitionUsage<PsiElement>>.first(predicate: (KotlinCallableDefinitionUsage<PsiElement>) -> Boolean): KotlinCallableDefinitionUsage<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCallableDefinitionUsage<PsiElement>

'it' @ [94:34] ==> value-parameter it: KotlinCallableDefinitionUsage<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.originalPrimaryCallable.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [94:37] ==> public final val declaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'baseDeclaration' @ [94:52] ==> public open val baseDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'getValue' @ [97:62] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'primaryCallables' @ [98:9] ==> public open val primaryCallables: Collection<KotlinCallableDefinitionUsage<PsiElement>> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'primaryCallables' @ [98:28] ==> public open val primaryCallables: Collection<KotlinCallableDefinitionUsage<PsiElement>> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'flatMapTo' @ [98:45] ==> public inline fun <T, R, C : MutableCollection<in UsageInfo>> Iterable<KotlinCallableDefinitionUsage<PsiElement>>.flatMapTo(destination: HashSet<UsageInfo>, transform: (KotlinCallableDefinitionUsage<PsiElement>) -> Iterable<UsageInfo>): HashSet<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCallableDefinitionUsage<PsiElement>
    <R> -> UsageInfo
    <C : MutableCollection<in R>> -> HashSet<UsageInfo>

'HashSet' @ [98:55] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> UsageInfo

'primaryFunction' @ [99:38] ==> value-parameter primaryFunction: KotlinCallableDefinitionUsage<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.affectedCallables.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [99:54] ==> public final val declaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'emptyList' @ [99:104] ==> public fun <T> emptyList(): List<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'primaryDeclaration' @ [101:17] ==> val primaryDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.affectedCallables.<anonymous>.<anonymous>[LocalVariableDescriptor]

'isHeaderOrHeaderClassMember' @ [101:36] ==> internal fun KtDeclaration.isHeaderOrHeaderClassMember(): Boolean defined in org.jetbrains.kotlin.idea.highlighter.markers in file DeclaredHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'primaryDeclaration' @ [102:34] ==> val primaryDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.affectedCallables.<anonymous>.<anonymous>[LocalVariableDescriptor]

'headerImplementations' @ [102:53] ==> internal fun KtDeclaration.headerImplementations(): Set<KtDeclaration> defined in org.jetbrains.kotlin.idea.highlighter.markers in file ImplementedHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'mapNotNull' @ [102:77] ==> public inline fun <T, R : Any> Iterable<KtDeclaration>.mapNotNull(transform: (KtDeclaration) -> KotlinCallableDefinitionUsage<PsiElement>?): List<KotlinCallableDefinitionUsage<PsiElement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration
    <R : Any> -> KotlinCallableDefinitionUsage<PsiElement>

'it' @ [103:38] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.affectedCallables.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [103:41] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'when (descriptor) {
                        is CallableDescriptor -> descriptor
                        is ClassDescriptor -> descriptor.unsubstitutedPrimaryConstructor ?: return@mapNotNull null
                        else -> return@mapNotNull null
                    }' @ [104:46] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CallableDescriptor, entry1: CallableDescriptor, entry2: CallableDescriptor): CallableDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CallableDescriptor

'descriptor' @ [104:52] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.affectedCallables.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [105:50] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.affectedCallables.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [106:47] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.affectedCallables.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'unsubstitutedPrimaryConstructor' @ [106:58] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'KotlinCallableDefinitionUsage' @ [109:21] ==> public constructor KotlinCallableDefinitionUsage<T : PsiElement>(function: PsiElement, originalCallableDescriptor: CallableDescriptor, baseFunction: KotlinCallableDefinitionUsage<PsiElement>?, samCallType: KotlinType?, canDropOverride: Boolean = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> PsiElement

'it' @ [109:63] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.affectedCallables.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'callableDescriptor' @ [109:67] ==> val callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.affectedCallables.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'primaryFunction' @ [109:87] ==> value-parameter primaryFunction: KotlinCallableDefinitionUsage<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.affectedCallables.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'primaryDeclaration' @ [113:17] ==> val primaryDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.affectedCallables.<anonymous>.<anonymous>[LocalVariableDescriptor]

'emptyList' @ [113:80] ==> public fun <T> emptyList(): List<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'primaryDeclaration' @ [115:13] ==> val primaryDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.affectedCallables.<anonymous>.<anonymous>[LocalVariableDescriptor]

'toLightMethods' @ [115:32] ==> public fun PsiElement.toLightMethods(): List<PsiMethod> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'flatMap' @ [115:49] ==> public inline fun <T, R> Iterable<PsiMethod>.flatMap(transform: (PsiMethod) -> Iterable<UsageInfo>): List<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <R> -> UsageInfo

'search' @ [117:26] ==> @NotNull public open fun search(@NotNull p0: PsiMethod): Query<(PsiMethod..PsiMethod?)> defined in com.intellij.psi.search.searches.OverridingMethodsSearch[JavaMethodDescriptor]

'baseMethod' @ [117:33] ==> value-parameter baseMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.affectedCallables.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'mapNotNullTo' @ [118:26] ==> public inline fun <T, R : Any, C : MutableCollection<in UsageInfo>> Iterable<(PsiMethod..PsiMethod?)>.mapNotNullTo(destination: HashSet<UsageInfo>, transform: ((PsiMethod..PsiMethod?)) -> UsageInfo?): HashSet<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)
    <R : Any> -> UsageInfo
    <C : MutableCollection<in R>> -> HashSet<UsageInfo>

'HashSet' @ [118:39] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> UsageInfo

'if (overridingMethod is KtLightMethod) {
                                val overridingDeclaration = overridingMethod.namedUnwrappedElement as KtNamedDeclaration
                                val overridingDescriptor = overridingDeclaration.resolveToDescriptor() as CallableDescriptor
                                KotlinCallableDefinitionUsage<PsiElement>(overridingDeclaration, overridingDescriptor, primaryFunction, null)
                            }
                            else OverriderUsageInfo(overridingMethod, baseMethod, true, true, true)' @ [119:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UsageInfo?, elseBranch: UsageInfo?): UsageInfo?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UsageInfo?

'overridingMethod' @ [119:33] ==> value-parameter overridingMethod: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.affectedCallables.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'overridingMethod' @ [120:61] ==> value-parameter overridingMethod: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.affectedCallables.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'namedUnwrappedElement' @ [120:78] ==> public val PsiElement.namedUnwrappedElement: PsiNamedElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'overridingDeclaration' @ [121:60] ==> val overridingDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.affectedCallables.<anonymous>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'resolveToDescriptor' @ [121:82] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'KotlinCallableDefinitionUsage' @ [122:33] ==> public constructor KotlinCallableDefinitionUsage<T : PsiElement>(function: PsiElement, originalCallableDescriptor: CallableDescriptor, baseFunction: KotlinCallableDefinitionUsage<PsiElement>?, samCallType: KotlinType?, canDropOverride: Boolean = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> PsiElement

'overridingDeclaration' @ [122:75] ==> val overridingDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.affectedCallables.<anonymous>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'overridingDescriptor' @ [122:98] ==> val overridingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.affectedCallables.<anonymous>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'primaryFunction' @ [122:120] ==> value-parameter primaryFunction: KotlinCallableDefinitionUsage<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.affectedCallables.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'OverriderUsageInfo' @ [124:34] ==> public constructor OverriderUsageInfo(p0: (PsiMethod..PsiMethod?), p1: (PsiMethod..PsiMethod?), p2: Boolean, p3: Boolean, p4: Boolean) defined in com.intellij.refactoring.changeSignature.OverriderUsageInfo[JavaClassConstructorDescriptor]

'overridingMethod' @ [124:53] ==> value-parameter overridingMethod: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.affectedCallables.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'baseMethod' @ [124:71] ==> value-parameter baseMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.affectedCallables.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parameters' @ [130:63] ==> private final val parameters: List<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'when (baseDescriptor) {
        is ConstructorDescriptor -> baseDescriptor.containingDeclaration.name.asString()
        is AnonymousFunctionDescriptor -> ""
        else -> baseDescriptor.name.asString()
    }' @ [132:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'baseDescriptor' @ [132:36] ==> public open val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'baseDescriptor' @ [133:37] ==> public open val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'containingDeclaration' @ [133:52] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'name' @ [133:74] ==> public final val ClassifierDescriptorWithTypeParameters.name: Name[MyPropertyDescriptor]

'asString' @ [133:79] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'baseDescriptor' @ [135:17] ==> public open val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'name' @ [135:32] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [135:37] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'baseDescriptor' @ [138:46] ==> public open val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'valueParameters' @ [138:61] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [138:77] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'baseDescriptor' @ [140:48] ==> public open val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'visibility' @ [140:63] ==> public final val CallableDescriptor.visibility: Visibility[MyPropertyDescriptor]

'baseDeclaration' @ [142:44] ==> public open val baseDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'isLocal' @ [145:29] ==> public open fun isLocal(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'baseDescriptor' @ [145:37] ==> public open val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'baseDescriptor' @ [146:22] ==> public open val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'containingDeclaration' @ [146:37] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'!' @ [147:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'baseDescriptor' @ [147:18] ==> public open val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'parent' @ [147:67] ==> val parent: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.canChangeVisibility[LocalVariableDescriptor]

'parent' @ [147:96] ==> val parent: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData.canChangeVisibility[LocalVariableDescriptor]

'kind' @ [147:103] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [147:121] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'!' @ [152:36] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'baseDescriptor' @ [152:38] ==> public open val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'baseDescriptor' @ [152:81] ==> public open val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'if (baseDescriptor is ConstructorDescriptor) MethodDescriptor.ReadWriteOption.None else MethodDescriptor.ReadWriteOption.ReadWrite' @ [155:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: MethodDescriptor.ReadWriteOption, elseBranch: MethodDescriptor.ReadWriteOption): MethodDescriptor.ReadWriteOption[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ReadWriteOption

'baseDescriptor' @ [155:17] ==> public open val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[PropertyDescriptorImpl]

'None' @ [155:91] ==> enum entry None defined in com.intellij.refactoring.changeSignature.MethodDescriptor.ReadWriteOption[FakeCallableDescriptorForObject]

'ReadWrite' @ [155:134] ==> enum entry ReadWrite defined in com.intellij.refactoring.changeSignature.MethodDescriptor.ReadWriteOption[FakeCallableDescriptorForObject]

