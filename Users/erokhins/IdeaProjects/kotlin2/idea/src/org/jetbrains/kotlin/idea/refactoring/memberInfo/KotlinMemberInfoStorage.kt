'AbstractMemberInfoStorage<KtNamedDeclaration, PsiNamedElement, KotlinMemberInfo>' @ [41:4] ==> public constructor AbstractMemberInfoStorage<T : (PsiElement..PsiElement?), C : (PsiElement..PsiElement?), M : (MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>..MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>?)>(p0: (PsiNamedElement..PsiNamedElement?), p1: (((KtNamedDeclaration..KtNamedDeclaration?)) -> Boolean..(((KtNamedDeclaration..KtNamedDeclaration?)) -> Boolean)?)) defined in com.intellij.refactoring.classMembers.AbstractMemberInfoStorage[SamAdapterClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtNamedDeclaration
    <C : (PsiElement..PsiElement?)> -> PsiNamedElement
    <M : (MemberInfoBase<(T..T?)>..MemberInfoBase<(T..T?)>?)> -> KotlinMemberInfo

'classOrObject' @ [41:85] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.<init>[ValueParameterDescriptorImpl]

'filter' @ [41:100] ==> value-parameter filter: (KtNamedDeclaration) -> Boolean = ... defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.<init>[ValueParameterDescriptorImpl]

'member1' @ [43:27] ==> value-parameter member1: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.memberConflict[ValueParameterDescriptorImpl]

'resolveToDescriptorWrapperAware' @ [43:35] ==> internal fun KtNamedDeclaration.resolveToDescriptorWrapperAware(resolutionFacade: ResolutionFacade? = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file memberInfoUtils.kt[SimpleFunctionDescriptorImpl]

'member' @ [44:26] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.memberConflict[ValueParameterDescriptorImpl]

'resolveToDescriptorWrapperAware' @ [44:33] ==> internal fun KtNamedDeclaration.resolveToDescriptorWrapperAware(resolutionFacade: ResolutionFacade? = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file memberInfoUtils.kt[SimpleFunctionDescriptorImpl]

'descriptor1' @ [45:13] ==> val descriptor1: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.memberConflict[LocalVariableDescriptor]

'name' @ [45:25] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'descriptor' @ [45:33] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.memberConflict[LocalVariableDescriptor]

'name' @ [45:44] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'when {
            descriptor1 is FunctionDescriptor && descriptor is FunctionDescriptor -> {
                val overloadUtil = member1.getResolutionFacade().frontendService<OverloadChecker>()
                !overloadUtil.isOverloadable(descriptor1, descriptor)
            }
            descriptor1 is PropertyDescriptor && descriptor is PropertyDescriptor ||
            descriptor1 is ClassDescriptor && descriptor is ClassDescriptor -> true
            else -> false
        }' @ [47:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'descriptor1' @ [48:13] ==> val descriptor1: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.memberConflict[LocalVariableDescriptor]

'descriptor' @ [48:50] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.memberConflict[LocalVariableDescriptor]

'member1' @ [49:36] ==> value-parameter member1: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.memberConflict[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [49:44] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'frontendService' @ [49:66] ==> public inline fun <reified T : Any> ResolutionFacade.frontendService(): OverloadChecker defined in org.jetbrains.kotlin.idea.resolve[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> OverloadChecker

'!' @ [50:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'overloadUtil' @ [50:18] ==> val overloadUtil: OverloadChecker defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.memberConflict[LocalVariableDescriptor]

'isOverloadable' @ [50:31] ==> public final fun isOverloadable(a: DeclarationDescriptor, b: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.OverloadChecker[DeserializedSimpleFunctionDescriptor]

'descriptor1' @ [50:46] ==> val descriptor1: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.memberConflict[LocalVariableDescriptor]

'descriptor' @ [50:59] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.memberConflict[LocalVariableDescriptor]

'descriptor1' @ [52:13] ==> val descriptor1: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.memberConflict[LocalVariableDescriptor]

'descriptor' @ [52:50] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.memberConflict[LocalVariableDescriptor]

'descriptor1' @ [53:13] ==> val descriptor1: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.memberConflict[LocalVariableDescriptor]

'descriptor' @ [53:47] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.memberConflict[LocalVariableDescriptor]

'aClass' @ [59:31] ==> value-parameter aClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.buildSubClassesMap[ValueParameterDescriptorImpl]

'getClassDescriptorIfAny' @ [59:38] ==> public fun PsiNamedElement.getClassDescriptorIfAny(resolutionFacade: ResolutionFacade? = ...): ClassDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file memberInfoUtils.kt[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [60:25] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.buildSubClassesMap[LocalVariableDescriptor]

'defaultType' @ [60:41] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'classType' @ [61:27] ==> val classType: SimpleType defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.buildSubClassesMap[LocalVariableDescriptor]

'immediateSupertypes' @ [61:37] ==> public fun KotlinType.immediateSupertypes(): Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'supertype' @ [62:30] ==> val supertype: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.buildSubClassesMap[LocalVariableDescriptor]

'constructor' @ [62:40] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [62:52] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'source' @ [62:75] ==> public final val ClassifierDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [62:83] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'superClass' @ [63:17] ==> val superClass: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.buildSubClassesMap[LocalVariableDescriptor]

'superClass' @ [63:42] ==> val superClass: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.buildSubClassesMap[LocalVariableDescriptor]

'getSubclasses' @ [64:17] ==> protected/*protected and package*/ open fun getSubclasses(p0: (PsiNamedElement..PsiNamedElement?)): (LinkedHashSet<(PsiNamedElement..PsiNamedElement?)>..LinkedHashSet<(PsiNamedElement..PsiNamedElement?)>?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage[JavaMethodDescriptor]

'superClass' @ [64:31] ==> val superClass: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.buildSubClassesMap[LocalVariableDescriptor]

'add' @ [64:62] ==> public open fun add(element: (PsiNamedElement..PsiNamedElement?)): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'aClass' @ [64:66] ==> value-parameter aClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.buildSubClassesMap[ValueParameterDescriptorImpl]

'buildSubClassesMap' @ [65:17] ==> protected open fun buildSubClassesMap(aClass: PsiNamedElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage[SimpleFunctionDescriptorImpl]

'superClass' @ [65:36] ==> val superClass: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.buildSubClassesMap[LocalVariableDescriptor]

'baseClass' @ [71:30] ==> value-parameter baseClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.isInheritor[ValueParameterDescriptorImpl]

'getClassDescriptorIfAny' @ [71:40] ==> public fun PsiNamedElement.getClassDescriptorIfAny(resolutionFacade: ResolutionFacade? = ...): ClassDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file memberInfoUtils.kt[SimpleFunctionDescriptorImpl]

'aClass' @ [72:33] ==> value-parameter aClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.isInheritor[ValueParameterDescriptorImpl]

'getClassDescriptorIfAny' @ [72:40] ==> public fun PsiNamedElement.getClassDescriptorIfAny(resolutionFacade: ResolutionFacade? = ...): ClassDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file memberInfoUtils.kt[SimpleFunctionDescriptorImpl]

'isSubclass' @ [73:32] ==> public open fun isSubclass(@NotNull p0: ClassDescriptor, @NotNull p1: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'currentDescriptor' @ [73:43] ==> val currentDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.isInheritor[LocalVariableDescriptor]

'baseDescriptor' @ [73:62] ==> val baseDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.isInheritor[LocalVariableDescriptor]

'aClass' @ [77:13] ==> value-parameter aClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.extractClassMembers[ValueParameterDescriptorImpl]

'temp' @ [78:13] ==> value-parameter temp: ArrayList<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.extractClassMembers[ValueParameterDescriptorImpl]

'extractClassMembers' @ [78:21] ==> public fun extractClassMembers(aClass: KtClassOrObject, collectSuperTypeEntries: Boolean = ..., filter: ((KtNamedDeclaration) -> Boolean)? = ...): List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file KotlinMemberInfoStorage.kt[SimpleFunctionDescriptorImpl]

'aClass' @ [78:41] ==> value-parameter aClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.extractClassMembers[ValueParameterDescriptorImpl]

'aClass' @ [78:49] ==> value-parameter aClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.extractClassMembers[ValueParameterDescriptorImpl]

'myClass' @ [78:59] ==> protected/*protected and package*/ final val myClass: (PsiNamedElement..PsiNamedElement?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage[JavaPropertyDescriptor]

'myFilter' @ [78:70] ==> protected/*protected and package*/ final val myFilter: (MemberInfoBase.Filter<(KtNamedDeclaration..KtNamedDeclaration?)>..MemberInfoBase.Filter<(KtNamedDeclaration..KtNamedDeclaration?)>?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage[JavaPropertyDescriptor]

'includeMember' @ [78:79] ==> public abstract fun includeMember(p0: (KtNamedDeclaration..KtNamedDeclaration?)): Boolean defined in com.intellij.refactoring.classMembers.MemberInfoBase.Filter[JavaMethodDescriptor]

'it' @ [78:93] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage.extractClassMembers.<anonymous>[ValueParameterDescriptorImpl]

'declarations' @ [93:9] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'filter' @ [94:18] ==> public inline fun <T> Iterable<KtDeclaration>.filter(predicate: (KtDeclaration) -> Boolean): List<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'it' @ [95:21] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers.extractFromClassBody.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [96:24] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers.extractFromClassBody.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [97:24] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [97:26] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers.extractFromClassBody.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [97:55] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers.extractFromClassBody.<anonymous>[ValueParameterDescriptorImpl]

'isCompanion' @ [97:58] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'filter' @ [98:25] ==> value-parameter filter: ((KtNamedDeclaration) -> Boolean)? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers.extractFromClassBody[ValueParameterDescriptorImpl]

'invoke' @ [98:43] ==> public abstract operator fun invoke(p1: KtNamedDeclaration): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [98:50] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers.extractFromClassBody.<anonymous>[ValueParameterDescriptorImpl]

'mapTo' @ [100:18] ==> public inline fun <T, R, C : MutableCollection<in KotlinMemberInfo>> Iterable<KtDeclaration>.mapTo(destination: MutableCollection<KotlinMemberInfo>, transform: (KtDeclaration) -> KotlinMemberInfo): MutableCollection<KotlinMemberInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration
    <R> -> KotlinMemberInfo
    <C : MutableCollection<in R>> -> MutableCollection<KotlinMemberInfo>

'result' @ [100:24] ==> value-parameter result: MutableCollection<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers.extractFromClassBody[ValueParameterDescriptorImpl]

'KotlinMemberInfo' @ [100:34] ==> @JvmOverloads public constructor KotlinMemberInfo(member: KtNamedDeclaration, isSuperClass: Boolean = ..., isCompanionMember: Boolean = ...) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo[ClassConstructorDescriptorImpl]

'it' @ [100:51] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers.extractFromClassBody.<anonymous>[ValueParameterDescriptorImpl]

'isCompanion' @ [100:97] ==> value-parameter isCompanion: Boolean defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers.extractFromClassBody[ValueParameterDescriptorImpl]

'ArrayList' @ [103:18] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinMemberInfo

'collectSuperTypeEntries' @ [105:9] ==> value-parameter collectSuperTypeEntries: Boolean = ... defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers[ValueParameterDescriptorImpl]

'aClass' @ [106:9] ==> value-parameter aClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers[ValueParameterDescriptorImpl]

'superTypeListEntries' @ [106:16] ==> public final val KtClassOrObject.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'filterIsInstance' @ [107:18] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtSuperTypeEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtSuperTypeEntry

'mapNotNull' @ [108:18] ==> public inline fun <T, R : Any> Iterable<KtSuperTypeEntry>.mapNotNull(transform: (KtSuperTypeEntry) -> KtNamedDeclaration?): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSuperTypeEntry
    <R : Any> -> KtNamedDeclaration

'it' @ [109:41] ==> value-parameter it: KtSuperTypeEntry defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers.<anonymous>[ValueParameterDescriptorImpl]

'typeReference' @ [109:44] ==> public final val KtSuperTypeEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeReference' @ [110:32] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers.<anonymous>[LocalVariableDescriptor]

'analyze' @ [110:46] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [110:70] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'TYPE' @ [110:94] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'typeReference' @ [110:100] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers.<anonymous>[LocalVariableDescriptor]

'type' @ [111:43] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers.<anonymous>[LocalVariableDescriptor]

'constructor' @ [111:49] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [111:62] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'classDescriptor' @ [112:36] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers.<anonymous>[LocalVariableDescriptor]

'source' @ [112:53] ==> public final val ClassDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [112:61] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'when (classPsi) {
                        is KtClass -> classPsi
                        is PsiClass -> KtPsiClassWrapper(classPsi)
                        else -> null
                    }' @ [113:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtNamedDeclaration?, entry1: KtNamedDeclaration?, entry2: KtNamedDeclaration?): KtNamedDeclaration?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtNamedDeclaration?

'classPsi' @ [113:27] ==> val classPsi: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers.<anonymous>[LocalVariableDescriptor]

'classPsi' @ [114:39] ==> val classPsi: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers.<anonymous>[LocalVariableDescriptor]

'KtPsiClassWrapper' @ [115:40] ==> public fun KtPsiClassWrapper(psiClass: PsiClass): KtPsiClassWrapper defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file KtPsiClassWrapper.kt[SimpleFunctionDescriptorImpl]

'classPsi' @ [115:58] ==> val classPsi: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers.<anonymous>[LocalVariableDescriptor]

'filter' @ [119:10] ==> public inline fun <T> Iterable<KtNamedDeclaration>.filter(predicate: (KtNamedDeclaration) -> Boolean): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'it' @ [119:19] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers.<anonymous>[ValueParameterDescriptorImpl]

'isInterfaceClass' @ [119:22] ==> public fun PsiNamedElement.isInterfaceClass(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'mapTo' @ [120:10] ==> public inline fun <T, R, C : MutableCollection<in KotlinMemberInfo>> Iterable<KtNamedDeclaration>.mapTo(destination: ArrayList<KotlinMemberInfo>, transform: (KtNamedDeclaration) -> KotlinMemberInfo): ArrayList<KotlinMemberInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration
    <R> -> KotlinMemberInfo
    <C : MutableCollection<in R>> -> ArrayList<KotlinMemberInfo>

'result' @ [120:16] ==> val result: ArrayList<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers[LocalVariableDescriptor]

'KotlinMemberInfo' @ [120:26] ==> @JvmOverloads public constructor KotlinMemberInfo(member: KtNamedDeclaration, isSuperClass: Boolean = ..., isCompanionMember: Boolean = ...) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo[ClassConstructorDescriptorImpl]

'it' @ [120:43] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers.<anonymous>[ValueParameterDescriptorImpl]

'aClass' @ [123:5] ==> value-parameter aClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers[ValueParameterDescriptorImpl]

'primaryConstructor' @ [123:12] ==> public final val KtClassOrObject.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'valueParameters' @ [124:15] ==> public final val KtPrimaryConstructor.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'filter' @ [125:15] ==> public inline fun <T> Iterable<(KtParameter..KtParameter?)>.filter(predicate: ((KtParameter..KtParameter?)) -> Boolean): List<(KtParameter..KtParameter?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'it' @ [125:24] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers.<anonymous>[ValueParameterDescriptorImpl]

'hasValOrVar' @ [125:27] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'mapTo' @ [126:15] ==> public inline fun <T, R, C : MutableCollection<in KotlinMemberInfo>> Iterable<(KtParameter..KtParameter?)>.mapTo(destination: ArrayList<KotlinMemberInfo>, transform: ((KtParameter..KtParameter?)) -> KotlinMemberInfo): ArrayList<KotlinMemberInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)
    <R> -> KotlinMemberInfo
    <C : MutableCollection<in R>> -> ArrayList<KotlinMemberInfo>

'result' @ [126:21] ==> val result: ArrayList<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers[LocalVariableDescriptor]

'KotlinMemberInfo' @ [126:31] ==> @JvmOverloads public constructor KotlinMemberInfo(member: KtNamedDeclaration, isSuperClass: Boolean = ..., isCompanionMember: Boolean = ...) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo[ClassConstructorDescriptorImpl]

'it' @ [126:48] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers.<anonymous>[ValueParameterDescriptorImpl]

'aClass' @ [128:5] ==> value-parameter aClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers[ValueParameterDescriptorImpl]

'extractFromClassBody' @ [128:12] ==> local final fun KtClassOrObject.extractFromClassBody(filter: ((KtNamedDeclaration) -> Boolean)?, isCompanion: Boolean, result: MutableCollection<KotlinMemberInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers[SimpleFunctionDescriptorImpl]

'filter' @ [128:33] ==> value-parameter filter: ((KtNamedDeclaration) -> Boolean)? = ... defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers[ValueParameterDescriptorImpl]

'result' @ [128:48] ==> val result: ArrayList<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers[LocalVariableDescriptor]

'aClass' @ [129:6] ==> value-parameter aClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers[ValueParameterDescriptorImpl]

'companionObjects' @ [129:27] ==> public final val KtClass.companionObjects: List<KtObjectDeclaration>[MyPropertyDescriptor]

'firstOrNull' @ [129:45] ==> public fun <T> List<KtObjectDeclaration>.firstOrNull(): KtObjectDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtObjectDeclaration

'extractFromClassBody' @ [129:60] ==> local final fun KtClassOrObject.extractFromClassBody(filter: ((KtNamedDeclaration) -> Boolean)?, isCompanion: Boolean, result: MutableCollection<KotlinMemberInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers[SimpleFunctionDescriptorImpl]

'filter' @ [129:81] ==> value-parameter filter: ((KtNamedDeclaration) -> Boolean)? = ... defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers[ValueParameterDescriptorImpl]

'result' @ [129:95] ==> val result: ArrayList<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers[LocalVariableDescriptor]

'result' @ [131:12] ==> val result: ArrayList<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.extractClassMembers[LocalVariableDescriptor]

