'KotlinPullUpDialogBase' @ [42:5] ==> protected/*protected and package*/ constructor KotlinPullUpDialogBase(project: (Project..Project?), `object`: (KtClassOrObject..KtClassOrObject?), superClasses: (MutableList<(PsiNamedElement..PsiNamedElement?)>..List<(PsiNamedElement..PsiNamedElement?)>?), memberInfoStorage: (KotlinMemberInfoStorage..KotlinMemberInfoStorage?), title: (String..String?)) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialogBase[JavaClassConstructorDescriptor]

'project' @ [43:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.<init>[ValueParameterDescriptorImpl]

'classOrObject' @ [43:18] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.<init>[ValueParameterDescriptorImpl]

'superClasses' @ [43:33] ==> value-parameter superClasses: List<PsiNamedElement> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.<init>[ValueParameterDescriptorImpl]

'memberInfoStorage' @ [43:47] ==> value-parameter memberInfoStorage: KotlinMemberInfoStorage defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.<init>[ValueParameterDescriptorImpl]

'PULL_MEMBERS_UP' @ [43:66] ==> public val PULL_MEMBERS_UP: String defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file KotlinPullUpHandler.kt[PropertyDescriptorImpl]

'init' @ [46:9] ==> protected/*protected and package*/ open fun init(): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog[JavaMethodDescriptor]

'KotlinUsesAndInterfacesDependencyMemberInfoModel<KtNamedDeclaration, KotlinMemberInfo>' @ [53:9] ==> public constructor KotlinUsesAndInterfacesDependencyMemberInfoModel<T : KtNamedDeclaration, M : MemberInfoBase<KtNamedDeclaration>>(klass: KtClassOrObject, superClass: PsiNamedElement?, recursive: Boolean, interfaceContainmentVerifier: (KtNamedDeclaration) -> Boolean = ...) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinUsesAndInterfacesDependencyMemberInfoModel[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtNamedDeclaration> -> KtNamedDeclaration
    <M : MemberInfoBase<T>> -> KotlinMemberInfo

'originalClass' @ [54:13] ==> value-parameter originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.<init>[ValueParameterDescriptorImpl]

'superClass' @ [55:13] ==> value-parameter superClass: PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.<init>[ValueParameterDescriptorImpl]

'interfaceContainmentVerifier' @ [57:13] ==> value-parameter interfaceContainmentVerifier: (KtNamedDeclaration) -> Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.<init>[ValueParameterDescriptorImpl]

'targetClass' @ [62:20] ==> value-parameter targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isConstructorParameterWithInterfaceTarget[ValueParameterDescriptorImpl]

'targetClass' @ [62:46] ==> value-parameter targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isConstructorParameterWithInterfaceTarget[ValueParameterDescriptorImpl]

'isInterface' @ [62:58] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'isConstructorDeclaredProperty' @ [62:75] ==> public fun KtNamedDeclaration.isConstructorDeclaredProperty(): Boolean defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]

'superClass' @ [77:30] ==> public final val KotlinPullUpDialog.superClass: PsiNamedElement?[MyPropertyDescriptor]

'superClass' @ [78:17] ==> val superClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractEnabled[LocalVariableDescriptor]

'superClass' @ [79:17] ==> val superClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractEnabled[LocalVariableDescriptor]

'memberInfo' @ [81:26] ==> value-parameter memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractEnabled[ValueParameterDescriptorImpl]

'member' @ [81:37] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'member' @ [82:17] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractEnabled[LocalVariableDescriptor]

'hasModifier' @ [82:24] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'INLINE_KEYWORD' @ [82:45] ==> public final val INLINE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'member' @ [83:17] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractEnabled[LocalVariableDescriptor]

'hasModifier' @ [83:24] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'EXTERNAL_KEYWORD' @ [83:45] ==> public final val EXTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'member' @ [84:17] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractEnabled[LocalVariableDescriptor]

'hasModifier' @ [84:24] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'LATEINIT_KEYWORD' @ [84:45] ==> public final val LATEINIT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'member' @ [85:17] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractEnabled[LocalVariableDescriptor]

'isAbstractInInterface' @ [85:24] ==> public fun KtNamedDeclaration.isAbstractInInterface(originalClass: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp[SimpleFunctionDescriptorImpl]

'sourceClass' @ [85:46] ==> private final val sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog[PropertyDescriptorImpl]

'member' @ [86:17] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractEnabled[LocalVariableDescriptor]

'isConstructorParameterWithInterfaceTarget' @ [86:24] ==> private final fun KtNamedDeclaration.isConstructorParameterWithInterfaceTarget(targetClass: PsiNamedElement): Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl[SimpleFunctionDescriptorImpl]

'superClass' @ [86:66] ==> val superClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractEnabled[LocalVariableDescriptor]

'member' @ [87:17] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractEnabled[LocalVariableDescriptor]

'isCompanionMemberOf' @ [87:24] ==> public fun KtNamedDeclaration.isCompanionMemberOf(klass: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'sourceClass' @ [87:44] ==> private final val sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog[PropertyDescriptorImpl]

'!' @ [89:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'superClass' @ [89:18] ==> val superClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractEnabled[LocalVariableDescriptor]

'isInterface' @ [89:29] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'member' @ [91:20] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractEnabled[LocalVariableDescriptor]

'member' @ [91:50] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractEnabled[LocalVariableDescriptor]

'!' @ [91:74] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'member' @ [91:75] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractEnabled[LocalVariableDescriptor]

'mustBeAbstractInInterface' @ [91:82] ==> public fun KtProperty.mustBeAbstractInInterface(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp[SimpleFunctionDescriptorImpl]

'member' @ [91:114] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractEnabled[LocalVariableDescriptor]

'superClass' @ [95:30] ==> public final val KotlinPullUpDialog.superClass: PsiNamedElement?[MyPropertyDescriptor]

'memberInfo' @ [96:26] ==> value-parameter memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractWhenDisabled[ValueParameterDescriptorImpl]

'member' @ [96:37] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'member' @ [97:17] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractWhenDisabled[LocalVariableDescriptor]

'isCompanionMemberOf' @ [97:24] ==> public fun KtNamedDeclaration.isCompanionMemberOf(klass: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'sourceClass' @ [97:44] ==> private final val sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog[PropertyDescriptorImpl]

'member' @ [98:17] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractWhenDisabled[LocalVariableDescriptor]

'isAbstractInInterface' @ [98:24] ==> public fun KtNamedDeclaration.isAbstractInInterface(originalClass: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp[SimpleFunctionDescriptorImpl]

'sourceClass' @ [98:46] ==> private final val sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog[PropertyDescriptorImpl]

'superClass' @ [99:17] ==> val superClass: PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractWhenDisabled[LocalVariableDescriptor]

'member' @ [99:39] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractWhenDisabled[LocalVariableDescriptor]

'isConstructorParameterWithInterfaceTarget' @ [99:46] ==> private final fun KtNamedDeclaration.isConstructorParameterWithInterfaceTarget(targetClass: PsiNamedElement): Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl[SimpleFunctionDescriptorImpl]

'superClass' @ [99:88] ==> val superClass: PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractWhenDisabled[LocalVariableDescriptor]

'member' @ [100:22] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractWhenDisabled[LocalVariableDescriptor]

'member' @ [100:46] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractWhenDisabled[LocalVariableDescriptor]

'superClass' @ [100:72] ==> val superClass: PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractWhenDisabled[LocalVariableDescriptor]

'member' @ [101:24] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractWhenDisabled[LocalVariableDescriptor]

'superClass' @ [101:53] ==> val superClass: PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isAbstractWhenDisabled[LocalVariableDescriptor]

'superClass' @ [105:30] ==> public final val KotlinPullUpDialog.superClass: PsiNamedElement?[MyPropertyDescriptor]

'memberInfo' @ [106:26] ==> value-parameter memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isMemberEnabled[ValueParameterDescriptorImpl]

'member' @ [106:37] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'member' @ [108:17] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isMemberEnabled[LocalVariableDescriptor]

'hasModifier' @ [108:24] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'CONST_KEYWORD' @ [108:45] ==> public final val CONST_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'superClass' @ [110:17] ==> val superClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isMemberEnabled[LocalVariableDescriptor]

'superClass' @ [110:42] ==> val superClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isMemberEnabled[LocalVariableDescriptor]

'isInterface' @ [110:53] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'member' @ [111:18] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isMemberEnabled[LocalVariableDescriptor]

'hasModifier' @ [111:25] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'INTERNAL_KEYWORD' @ [111:46] ==> public final val INTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'member' @ [111:67] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isMemberEnabled[LocalVariableDescriptor]

'hasModifier' @ [111:74] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'PROTECTED_KEYWORD' @ [111:95] ==> public final val PROTECTED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'superClass' @ [113:17] ==> val superClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isMemberEnabled[LocalVariableDescriptor]

'!' @ [114:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'member' @ [114:22] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isMemberEnabled[LocalVariableDescriptor]

'canMoveMemberToJavaClass' @ [114:29] ==> public fun KtNamedDeclaration.canMoveMemberToJavaClass(targetClass: PsiClass): Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'superClass' @ [114:54] ==> val superClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isMemberEnabled[LocalVariableDescriptor]

'member' @ [115:21] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isMemberEnabled[LocalVariableDescriptor]

'isCompanionMemberOf' @ [115:28] ==> public fun KtNamedDeclaration.isCompanionMemberOf(klass: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'sourceClass' @ [115:48] ==> private final val sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog[PropertyDescriptorImpl]

'memberInfo' @ [117:17] ==> value-parameter memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isMemberEnabled[ValueParameterDescriptorImpl]

'memberInfoStorage' @ [117:31] ==> private final val memberInfoStorage: KotlinMemberInfoStorage defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog[PropertyDescriptorImpl]

'getDuplicatedMemberInfos' @ [117:49] ==> public open fun getDuplicatedMemberInfos(p0: (PsiNamedElement..PsiNamedElement?)): (MutableSet<(KotlinMemberInfo..KotlinMemberInfo?)>..Set<(KotlinMemberInfo..KotlinMemberInfo?)>?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage[JavaMethodDescriptor]

'superClass' @ [117:74] ==> val superClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isMemberEnabled[LocalVariableDescriptor]

'member' @ [118:17] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isMemberEnabled[LocalVariableDescriptor]

'memberInfoStorage' @ [118:27] ==> private final val memberInfoStorage: KotlinMemberInfoStorage defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog[PropertyDescriptorImpl]

'getExtending' @ [118:45] ==> public open fun getExtending(p0: (PsiNamedElement..PsiNamedElement?)): (MutableSet<(PsiNamedElement..PsiNamedElement?)>..Set<(PsiNamedElement..PsiNamedElement?)>?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfoStorage[JavaMethodDescriptor]

'superClass' @ [118:58] ==> val superClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.isMemberEnabled[LocalVariableDescriptor]

'super' @ [123:13] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl[LazyClassReceiverParameterDescriptor]

'memberInfoChanged' @ [123:19] ==> public open fun memberInfoChanged(p0: (MemberInfoChange<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>..MemberInfoChange<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>?)): Unit defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinUsesAndInterfacesDependencyMemberInfoModel[JavaMethodDescriptor]

'event' @ [123:37] ==> value-parameter event: MemberInfoChange<KtNamedDeclaration, KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.memberInfoChanged[ValueParameterDescriptorImpl]

'superClass' @ [124:30] ==> public final val KotlinPullUpDialog.superClass: PsiNamedElement?[MyPropertyDescriptor]

'superClass' @ [125:17] ==> val superClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.memberInfoChanged[LocalVariableDescriptor]

'lastSuperClass' @ [125:31] ==> private final var lastSuperClass: PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl[PropertyDescriptorImpl]

'lastSuperClass' @ [126:17] ==> private final var lastSuperClass: PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl[PropertyDescriptorImpl]

'superClass' @ [126:34] ==> val superClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.memberInfoChanged[LocalVariableDescriptor]

'superClass' @ [127:35] ==> val superClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.memberInfoChanged[LocalVariableDescriptor]

'superClass' @ [127:60] ==> val superClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.memberInfoChanged[LocalVariableDescriptor]

'isInterface' @ [127:71] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'event' @ [128:17] ==> value-parameter event: MemberInfoChange<KtNamedDeclaration, KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.memberInfoChanged[ValueParameterDescriptorImpl]

'changedMembers' @ [128:23] ==> public final val <T : (PsiElement..PsiElement?), U : (MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>..MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>?)> MemberInfoChange<KtNamedDeclaration, KotlinMemberInfo>.changedMembers: (MutableCollection<(KotlinMemberInfo..KotlinMemberInfo?)>..Collection<(KotlinMemberInfo..KotlinMemberInfo?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtNamedDeclaration
    <U : (MemberInfoBase<(T..T?)>..MemberInfoBase<(T..T?)>?)> -> KotlinMemberInfo

'forEach' @ [128:38] ==> @HidesMembers public inline fun <T> Iterable<(KotlinMemberInfo..KotlinMemberInfo?)>.forEach(action: ((KotlinMemberInfo..KotlinMemberInfo?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo..org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo?)

'it' @ [128:48] ==> value-parameter it: (KotlinMemberInfo..KotlinMemberInfo?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.memberInfoChanged.<anonymous>[ValueParameterDescriptorImpl]

'isToAbstract' @ [128:51] ==> public final var KotlinMemberInfo.isToAbstract: Boolean[MyPropertyDescriptor]

'isInterface' @ [128:66] ==> val isInterface: Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.memberInfoChanged[LocalVariableDescriptor]

'setSuperClass' @ [129:17] ==> @Suppress public final fun setSuperClass(superClass: PsiNamedElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl[SimpleFunctionDescriptorImpl]

'superClass' @ [129:31] ==> val superClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl.memberInfoChanged[LocalVariableDescriptor]

'myMemberInfoStorage' @ [134:68] ==> protected/*protected and package*/ final val myMemberInfoStorage: (KotlinMemberInfoStorage..KotlinMemberInfoStorage?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog[JavaPropertyDescriptor]

'myClass' @ [136:54] ==> protected/*protected and package*/ final val myClass: (PsiNamedElement..PsiNamedElement?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog[JavaPropertyDescriptor]

'+' @ [138:45] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'this' @ [138:51] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog[LazyClassReceiverParameterDescriptor]

'java' @ [138:63] ==> public val <T> KClass<out KotlinPullUpDialog>.java: Class<out KotlinPullUpDialog> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinPullUpDialog

'name' @ [138:68] ==> public final val <T : (Any..Any?)> Class<out KotlinPullUpDialog>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinPullUpDialog

'super' @ [140:36] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog[LazyClassReceiverParameterDescriptor]

'getSuperClass' @ [140:42] ==> @Nullable public open fun getSuperClass(): PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialogBase[JavaMethodDescriptor]

'MemberInfoModelImpl' @ [143:13] ==> public constructor MemberInfoModelImpl(originalClass: KtClassOrObject, superClass: PsiNamedElement?, interfaceContainmentVerifier: (KtNamedDeclaration) -> Boolean) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.MemberInfoModelImpl[ClassConstructorDescriptorImpl]

'sourceClass' @ [143:33] ==> private final val sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog[PropertyDescriptorImpl]

'preselection' @ [143:46] ==> protected for synthetic extension final val KotlinPullUpDialog.preselection: PsiNamedElement?[MyPropertyDescriptor]

'getInterfaceContainmentVerifier' @ [143:60] ==> public fun getInterfaceContainmentVerifier(getMemberInfos: () -> List<KotlinMemberInfo>): (KtNamedDeclaration) -> Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp[SimpleFunctionDescriptorImpl]

'selectedMemberInfos' @ [143:94] ==> public final val KotlinPullUpDialog.selectedMemberInfos: (MutableList<(KotlinMemberInfo..KotlinMemberInfo?)>..List<(KotlinMemberInfo..KotlinMemberInfo?)>?)[MyPropertyDescriptor]

'mySuperClasses' @ [145:38] ==> protected/*protected and package*/ final val mySuperClasses: (MutableList<(PsiNamedElement..PsiNamedElement?)>..List<(PsiNamedElement..PsiNamedElement?)>?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog[JavaPropertyDescriptor]

'firstOrNull' @ [145:53] ==> public inline fun <T> Iterable<(PsiNamedElement..PsiNamedElement?)>.firstOrNull(predicate: ((PsiNamedElement..PsiNamedElement?)) -> Boolean): PsiNamedElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiNamedElement..com.intellij.psi.PsiNamedElement?)

'!' @ [145:67] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [145:68] ==> value-parameter it: (PsiNamedElement..PsiNamedElement?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.getPreselection.<anonymous>[ValueParameterDescriptorImpl]

'isInterfaceClass' @ [145:71] ==> public fun PsiNamedElement.isInterfaceClass(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'mySuperClasses' @ [145:95] ==> protected/*protected and package*/ final val mySuperClasses: (MutableList<(PsiNamedElement..PsiNamedElement?)>..List<(PsiNamedElement..PsiNamedElement?)>?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog[JavaPropertyDescriptor]

'firstOrNull' @ [145:110] ==> public fun <T> List<(PsiNamedElement..PsiNamedElement?)>.firstOrNull(): PsiNamedElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiNamedElement..com.intellij.psi.PsiNamedElement?)

'KotlinMemberSelectionTable' @ [148:13] ==> public constructor KotlinMemberSelectionTable(memberInfos: List<KotlinMemberInfo>, memberInfoModel: MemberInfoModel<KtNamedDeclaration, KotlinMemberInfo>?, abstractColumnHeader: String?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberSelectionTable[ClassConstructorDescriptorImpl]

'infos' @ [148:40] ==> value-parameter infos: MutableList<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.createMemberSelectionTable[ValueParameterDescriptorImpl]

'selectedMemberInfos' @ [150:40] ==> public final val KotlinPullUpDialog.selectedMemberInfos: (MutableList<(KotlinMemberInfo..KotlinMemberInfo?)>..List<(KotlinMemberInfo..KotlinMemberInfo?)>?)[MyPropertyDescriptor]

'size' @ [150:60] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'selectedMemberInfos' @ [153:31] ==> public final val KotlinPullUpDialog.selectedMemberInfos: (MutableList<(KotlinMemberInfo..KotlinMemberInfo?)>..List<(KotlinMemberInfo..KotlinMemberInfo?)>?)[MyPropertyDescriptor]

'superClass' @ [154:27] ==> public final val KotlinPullUpDialog.superClass: PsiNamedElement?[MyPropertyDescriptor]

'checkConflicts' @ [155:9] ==> public fun checkConflicts(project: Project, sourceClass: KtClassOrObject, targetClass: PsiNamedElement, memberInfos: List<KotlinMemberInfo>, onShowConflicts: () -> Unit = ..., onAccept: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp[SimpleFunctionDescriptorImpl]

'project' @ [155:24] ==> protected/*protected and package*/ for synthetic extension final val KotlinPullUpDialog.project: (Project..Project?)[MyPropertyDescriptor]

'sourceClass' @ [155:33] ==> private final val sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog[PropertyDescriptorImpl]

'targetClass' @ [155:46] ==> val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.doAction[LocalVariableDescriptor]

'selectedMembers' @ [155:59] ==> val selectedMembers: (MutableList<(KotlinMemberInfo..KotlinMemberInfo?)>..List<(KotlinMemberInfo..KotlinMemberInfo?)>?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.doAction[LocalVariableDescriptor]

'close' @ [155:78] ==> public final fun close(p0: Int): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog[JavaMethodDescriptor]

'OK_EXIT_CODE' @ [155:98] ==> public const final val OK_EXIT_CODE: Int defined in com.intellij.openapi.ui.DialogWrapper[JavaPropertyDescriptor]

'invokeRefactoring' @ [156:13] ==> protected/*protected and package*/ open fun invokeRefactoring(p0: (BaseRefactoringProcessor..BaseRefactoringProcessor?)): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog[JavaMethodDescriptor]

'createProcessor' @ [156:31] ==> public final fun createProcessor(sourceClass: KtClassOrObject, targetClass: PsiNamedElement, memberInfos: List<KotlinMemberInfo>): PullUpProcessor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.Companion[SimpleFunctionDescriptorImpl]

'sourceClass' @ [156:47] ==> private final val sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog[PropertyDescriptorImpl]

'targetClass' @ [156:60] ==> val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.doAction[LocalVariableDescriptor]

'selectedMembers' @ [156:73] ==> val selectedMembers: (MutableList<(KotlinMemberInfo..KotlinMemberInfo?)>..List<(KotlinMemberInfo..KotlinMemberInfo?)>?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.doAction[LocalVariableDescriptor]

'targetClass' @ [164:34] ==> value-parameter targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.Companion.createProcessor[ValueParameterDescriptorImpl]

'targetClass' @ [164:63] ==> value-parameter targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.Companion.createProcessor[ValueParameterDescriptorImpl]

'toLightClass' @ [164:87] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'PullUpProcessor' @ [165:20] ==> public constructor PullUpProcessor(p0: (PsiClass..PsiClass?), p1: (PsiClass..PsiClass?), p2: (Array<(MemberInfo..MemberInfo?)>..Array<out (MemberInfo..MemberInfo?)>?), p3: raw (DocCommentPolicy<(PsiComment..PsiComment?)>..DocCommentPolicy<*>?)) defined in com.intellij.refactoring.memberPullUp.PullUpProcessor[JavaClassConstructorDescriptor]

'sourceClass' @ [165:36] ==> value-parameter sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.Companion.createProcessor[ValueParameterDescriptorImpl]

'toLightClass' @ [165:48] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'targetPsiClass' @ [166:36] ==> val targetPsiClass: PsiClass? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.Companion.createProcessor[LocalVariableDescriptor]

'memberInfos' @ [167:36] ==> value-parameter memberInfos: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.Companion.createProcessor[ValueParameterDescriptorImpl]

'mapNotNull' @ [167:48] ==> public inline fun <T, R : Any> Iterable<KotlinMemberInfo>.mapNotNull(transform: (KotlinMemberInfo) -> MemberInfo?): List<MemberInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinMemberInfo
    <R : Any> -> MemberInfo

'it' @ [167:61] ==> value-parameter it: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpDialog.Companion.createProcessor.<anonymous>[ValueParameterDescriptorImpl]

'toJavaMemberInfo' @ [167:64] ==> public fun MemberInfoBase<out KtNamedDeclaration>.toJavaMemberInfo(): MemberInfo? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo[SimpleFunctionDescriptorImpl]

'toTypedArray' @ [167:85] ==> public inline fun <reified T> Collection<MemberInfo>.toTypedArray(): Array<MemberInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> MemberInfo

'DocCommentPolicy' @ [168:36] ==> public constructor DocCommentPolicy<T : (PsiComment..PsiComment?)>(p0: Int) defined in com.intellij.refactoring.util.DocCommentPolicy[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiComment..PsiComment?)> -> PsiComment

'getInstance' @ [168:89] ==> public open fun getInstance(): (JavaRefactoringSettings..JavaRefactoringSettings?) defined in com.intellij.refactoring.JavaRefactoringSettings[JavaMethodDescriptor]

'PULL_UP_MEMBERS_JAVADOC' @ [168:103] ==> public final var PULL_UP_MEMBERS_JAVADOC: Int defined in com.intellij.refactoring.JavaRefactoringSettings[JavaPropertyDescriptor]

