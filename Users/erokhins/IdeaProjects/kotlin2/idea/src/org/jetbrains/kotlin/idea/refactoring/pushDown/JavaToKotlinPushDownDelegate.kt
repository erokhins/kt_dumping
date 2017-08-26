'JavaPushDownDelegate' @ [46:38] ==> public constructor JavaPushDownDelegate() defined in com.intellij.refactoring.memberPushDown.JavaPushDownDelegate[JavaClassConstructorDescriptor]

'super' @ [53:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate[LazyClassReceiverParameterDescriptor]

'checkTargetClassConflicts' @ [53:15] ==> public open fun checkTargetClassConflicts(@Nullable p0: PsiElement?, p1: (PushDownData<(MemberInfo..MemberInfo?), (PsiMember..PsiMember?)>..PushDownData<(MemberInfo..MemberInfo?), (PsiMember..PsiMember?)>?), p2: (MultiMap<(PsiElement..PsiElement?), (String..String?)>..MultiMap<(PsiElement..PsiElement?), (String..String?)>?), p3: NewSubClassData?): Unit defined in com.intellij.refactoring.memberPushDown.JavaPushDownDelegate[JavaMethodDescriptor]

'targetClass' @ [53:41] ==> value-parameter targetClass: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.checkTargetClassConflicts[ValueParameterDescriptorImpl]

'pushDownData' @ [53:54] ==> value-parameter pushDownData: PushDownData<MemberInfo, PsiMember> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.checkTargetClassConflicts[ValueParameterDescriptorImpl]

'conflicts' @ [53:68] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.checkTargetClassConflicts[ValueParameterDescriptorImpl]

'subClassData' @ [53:79] ==> value-parameter subClassData: NewSubClassData? defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.checkTargetClassConflicts[ValueParameterDescriptorImpl]

'targetClass' @ [55:23] ==> value-parameter targetClass: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.checkTargetClassConflicts[ValueParameterDescriptorImpl]

'unwrapped' @ [55:36] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'ktClass' @ [56:37] ==> val ktClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.checkTargetClassConflicts[LocalVariableDescriptor]

'resolveToDescriptor' @ [56:45] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'pushDownData' @ [57:28] ==> value-parameter pushDownData: PushDownData<MemberInfo, PsiMember> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.checkTargetClassConflicts[ValueParameterDescriptorImpl]

'membersToMove' @ [57:41] ==> public final val <MemberInfo : (MemberInfoBase<(PsiMember..PsiMember?)>..MemberInfoBase<(PsiMember..PsiMember?)>?), Member : (PsiElement..PsiElement?)> PushDownData<MemberInfo, PsiMember>.membersToMove: (MutableList<(MemberInfo..MemberInfo?)>..List<(MemberInfo..MemberInfo?)>?)[MyPropertyDescriptor]
Inferred types:
    <MemberInfo : (MemberInfoBase<(Member..Member?)>..MemberInfoBase<(Member..Member?)>?)> -> MemberInfo
    <Member : (PsiElement..PsiElement?)> -> PsiMember

'memberInfo' @ [58:26] ==> val memberInfo: (MemberInfo..MemberInfo?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.checkTargetClassConflicts[LocalVariableDescriptor]

'member' @ [58:37] ==> public final val MemberInfo.member: (PsiMember..PsiMember?)[MyPropertyDescriptor]

'checkExternalUsages' @ [59:13] ==> internal fun checkExternalUsages(conflicts: MultiMap<PsiElement, String>, member: PsiElement, targetClassDescriptor: ClassDescriptor, resolutionFacade: ResolutionFacade): Unit defined in org.jetbrains.kotlin.idea.refactoring.pushDown[SimpleFunctionDescriptorImpl]

'conflicts' @ [59:33] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.checkTargetClassConflicts[ValueParameterDescriptorImpl]

'member' @ [59:44] ==> val member: PsiMember defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.checkTargetClassConflicts[LocalVariableDescriptor]

'targetClassDescriptor' @ [59:52] ==> val targetClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.checkTargetClassConflicts[LocalVariableDescriptor]

'ktClass' @ [59:75] ==> val ktClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.checkTargetClassConflicts[LocalVariableDescriptor]

'getResolutionFacade' @ [59:83] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'pushDownData' @ [64:26] ==> value-parameter pushDownData: PushDownData<MemberInfo, PsiMember> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[ValueParameterDescriptorImpl]

'sourceClass' @ [64:39] ==> public final var <MemberInfo : (MemberInfoBase<(PsiMember..PsiMember?)>..MemberInfoBase<(PsiMember..PsiMember?)>?), Member : (PsiElement..PsiElement?)> PushDownData<MemberInfo, PsiMember>.sourceClass: (PsiElement..PsiElement?)[MyPropertyDescriptor]
Inferred types:
    <MemberInfo : (MemberInfoBase<(Member..Member?)>..MemberInfoBase<(Member..Member?)>?)> -> MemberInfo
    <Member : (PsiElement..PsiElement?)> -> PsiMember

'targetClass' @ [65:24] ==> value-parameter targetClass: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[ValueParameterDescriptorImpl]

'unwrapped' @ [65:36] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'subClass' @ [66:32] ==> val subClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'getResolutionFacade' @ [66:41] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'superClass' @ [67:36] ==> val superClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'getJavaClassDescriptor' @ [67:47] ==> @JvmOverloads public fun PsiClass.getJavaClassDescriptor(resolutionFacade: ResolutionFacade? = ...): ClassDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [67:70] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'subClass' @ [68:34] ==> val subClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'resolveToDescriptor' @ [68:43] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getTypeSubstitutor' @ [69:27] ==> public fun getTypeSubstitutor(baseType: KotlinType, derivedType: KotlinType): TypeSubstitutor? defined in org.jetbrains.kotlin.types.substitutions[DeserializedSimpleFunctionDescriptor]

'superClassDescriptor' @ [69:46] ==> val superClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'defaultType' @ [69:67] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'subClassDescriptor' @ [69:80] ==> val subClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'defaultType' @ [69:99] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'EMPTY' @ [69:131] ==> public final val EMPTY: (TypeSubstitutor..TypeSubstitutor?) defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaPropertyDescriptor]

'KtPsiFactory' @ [70:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'subClass' @ [70:39] ==> val subClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'pushDownData' @ [72:37] ==> value-parameter pushDownData: PushDownData<MemberInfo, PsiMember> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[ValueParameterDescriptorImpl]

'membersToMove' @ [72:50] ==> public final val <MemberInfo : (MemberInfoBase<(PsiMember..PsiMember?)>..MemberInfoBase<(PsiMember..PsiMember?)>?), Member : (PsiElement..PsiElement?)> PushDownData<MemberInfo, PsiMember>.membersToMove: (MutableList<(MemberInfo..MemberInfo?)>..List<(MemberInfo..MemberInfo?)>?)[MyPropertyDescriptor]
Inferred types:
    <MemberInfo : (MemberInfoBase<(Member..Member?)>..MemberInfoBase<(Member..Member?)>?)> -> MemberInfo
    <Member : (PsiElement..PsiElement?)> -> PsiMember

'memberInfo' @ [73:26] ==> val memberInfo: (MemberInfo..MemberInfo?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'member' @ [73:37] ==> public final val MemberInfo.member: (PsiMember..PsiMember?)[MyPropertyDescriptor]

'member' @ [74:36] ==> val member: (PsiMember..PsiMember?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'getJavaMemberDescriptor' @ [74:43] ==> @JvmOverloads public fun PsiMember.getJavaMemberDescriptor(resolutionFacade: ResolutionFacade? = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [74:67] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'when (member) {
                is PsiMethod, is PsiField -> {
                    val ktMember = member.j2k() as? KtCallableDeclaration ?: continue@members
                    ktMember.removeModifier(KtTokens.DEFAULT_VISIBILITY_KEYWORD)
                    val isStatic = member.hasModifierProperty(PsiModifier.STATIC)
                    val targetMemberClass = if (isStatic && subClass is KtClass) subClass.getOrCreateCompanionObject() else subClass
                    val targetMemberClassDescriptor = resolutionFacade.resolveToDescriptor(targetMemberClass) as ClassDescriptor
                    if (member.hasModifierProperty(PsiModifier.ABSTRACT)) {
                        hasAbstractMembers = true
                    }
                    moveCallableMemberToClass(
                            ktMember,
                            memberDescriptor as CallableMemberDescriptor,
                            targetMemberClass,
                            targetMemberClassDescriptor,
                            substitutor,
                            memberInfo.isToAbstract
                    ).apply {
                        if (subClass.isInterfaceClass()) {
                            removeModifier(KtTokens.ABSTRACT_KEYWORD)
                        }
                    }
                }

                is PsiClass -> {
                    if (memberInfo.overrides != null) {
                        val typeText = RefactoringUtil.findReferenceToClass(superClass.implementsList, member)?.j2kText() ?: continue@members
                        subClass.addSuperTypeListEntry(psiFactory.createSuperTypeEntry(typeText))
                    }
                    else {
                        val ktClass = member.j2k() as? KtClassOrObject ?: continue@members
                        addMemberToTarget(ktClass, subClass)
                    }
                }
            }' @ [75:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtElement, entry1: KtElement): KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtElement

'member' @ [75:19] ==> val member: (PsiMember..PsiMember?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'member' @ [77:36] ==> val member: (PsiMember..PsiMember?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'j2k' @ [77:43] ==> public fun PsiMember.j2k(): KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'ktMember' @ [78:21] ==> val ktMember: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'removeModifier' @ [78:30] ==> public abstract fun removeModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'DEFAULT_VISIBILITY_KEYWORD' @ [78:54] ==> public final val DEFAULT_VISIBILITY_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'member' @ [79:36] ==> val member: (PsiMember..PsiMember?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'hasModifierProperty' @ [79:43] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMember[JavaMethodDescriptor]

'STATIC' @ [79:75] ==> public const final val STATIC: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'if (isStatic && subClass is KtClass) subClass.getOrCreateCompanionObject() else subClass' @ [80:45] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtClassOrObject, elseBranch: KtClassOrObject): KtClassOrObject[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtClassOrObject

'isStatic' @ [80:49] ==> val isStatic: Boolean defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'subClass' @ [80:61] ==> val subClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'subClass' @ [80:82] ==> val subClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'getOrCreateCompanionObject' @ [80:91] ==> public fun KtClass.getOrCreateCompanionObject(): KtObjectDeclaration defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'subClass' @ [80:125] ==> val subClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'resolutionFacade' @ [81:55] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'resolveToDescriptor' @ [81:72] ==> public abstract fun resolveToDescriptor(declaration: KtDeclaration, bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'targetMemberClass' @ [81:92] ==> val targetMemberClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'member' @ [82:25] ==> val member: (PsiMember..PsiMember?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'hasModifierProperty' @ [82:32] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMember[JavaMethodDescriptor]

'ABSTRACT' @ [82:64] ==> public const final val ABSTRACT: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'hasAbstractMembers' @ [83:25] ==> var hasAbstractMembers: Boolean defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'moveCallableMemberToClass' @ [85:21] ==> internal fun moveCallableMemberToClass(member: KtCallableDeclaration, memberDescriptor: CallableMemberDescriptor, targetClass: KtClassOrObject, targetClassDescriptor: ClassDescriptor, substitutor: TypeSubstitutor, makeAbstract: Boolean): KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pushDown in file pushDownImpl.kt[SimpleFunctionDescriptorImpl]

'ktMember' @ [86:29] ==> val ktMember: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'memberDescriptor' @ [87:29] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'targetMemberClass' @ [88:29] ==> val targetMemberClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'targetMemberClassDescriptor' @ [89:29] ==> val targetMemberClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'substitutor' @ [90:29] ==> val substitutor: (TypeSubstitutor..TypeSubstitutor?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'memberInfo' @ [91:29] ==> val memberInfo: (MemberInfo..MemberInfo?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'isToAbstract' @ [91:40] ==> public final var MemberInfo.isToAbstract: Boolean[MyPropertyDescriptor]

'apply' @ [92:23] ==> @InlineOnly public inline fun <T> KtCallableDeclaration.apply(block: KtCallableDeclaration.() -> Unit): KtCallableDeclaration defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallableDeclaration

'subClass' @ [93:29] ==> val subClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'isInterfaceClass' @ [93:38] ==> public fun PsiNamedElement.isInterfaceClass(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'removeModifier' @ [94:29] ==> public abstract fun removeModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [94:53] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (memberInfo.overrides != null) {
                        val typeText = RefactoringUtil.findReferenceToClass(superClass.implementsList, member)?.j2kText() ?: continue@members
                        subClass.addSuperTypeListEntry(psiFactory.createSuperTypeEntry(typeText))
                    }
                    else {
                        val ktClass = member.j2k() as? KtClassOrObject ?: continue@members
                        addMemberToTarget(ktClass, subClass)
                    }' @ [100:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtElement, elseBranch: KtElement): KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtElement

'memberInfo' @ [100:25] ==> val memberInfo: (MemberInfo..MemberInfo?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'overrides' @ [100:36] ==> public final val MemberInfo.overrides: (Boolean..Boolean?)[MyPropertyDescriptor]

'?:' @ [101:40] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'findReferenceToClass' @ [101:56] ==> public open fun findReferenceToClass(p0: (PsiReferenceList..PsiReferenceList?), p1: (PsiClass..PsiClass?)): (PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?) defined in com.intellij.refactoring.util.RefactoringUtil[JavaMethodDescriptor]

'superClass' @ [101:77] ==> val superClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'implementsList' @ [101:88] ==> public final val PsiClass.implementsList: PsiReferenceList?[MyPropertyDescriptor]

'member' @ [101:104] ==> val member: (PsiMember..PsiMember?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'j2kText' @ [101:113] ==> public fun PsiElement.j2kText(): String? defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'subClass' @ [102:25] ==> val subClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'addSuperTypeListEntry' @ [102:34] ==> public final fun addSuperTypeListEntry(superTypeListEntry: KtSuperTypeListEntry): KtSuperTypeListEntry defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'psiFactory' @ [102:56] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'createSuperTypeEntry' @ [102:67] ==> public final fun createSuperTypeEntry(text: String): KtSuperTypeEntry defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'typeText' @ [102:88] ==> val typeText: String defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'member' @ [105:39] ==> val member: (PsiMember..PsiMember?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'j2k' @ [105:46] ==> public fun PsiMember.j2k(): KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'addMemberToTarget' @ [106:25] ==> public fun addMemberToTarget(targetMember: KtNamedDeclaration, targetClass: KtClassOrObject): KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'ktClass' @ [106:43] ==> val ktClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'subClass' @ [106:52] ==> val subClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'hasAbstractMembers' @ [112:13] ==> var hasAbstractMembers: Boolean defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'!' @ [112:35] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'subClass' @ [112:36] ==> val subClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'isInterfaceClass' @ [112:45] ==> public fun PsiNamedElement.isInterfaceClass(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'subClass' @ [113:13] ==> val subClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pushDown.JavaToKotlinPushDownDelegate.pushDownToClass[LocalVariableDescriptor]

'addModifier' @ [113:22] ==> public open fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtClassOrObject[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [113:43] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

