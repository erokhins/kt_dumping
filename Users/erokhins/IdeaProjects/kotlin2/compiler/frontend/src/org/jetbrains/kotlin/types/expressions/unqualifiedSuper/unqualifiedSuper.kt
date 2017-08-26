'superExpression' @ [42:25] ==> value-parameter superExpression: KtSuperExpression defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveUnqualifiedSuperFromExpressionContext[ValueParameterDescriptorImpl]

'parent' @ [42:41] ==> public final val KtSuperExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parentElement' @ [44:9] ==> val parentElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveUnqualifiedSuperFromExpressionContext[LocalVariableDescriptor]

'parentElement' @ [45:34] ==> val parentElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveUnqualifiedSuperFromExpressionContext[LocalVariableDescriptor]

'selectorExpression' @ [45:48] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[PropertyDescriptorImpl]

'when (selectorExpression) {
            is KtCallExpression -> {
                // super.foo(...): foo can be a function or a property of a callable type
                val calleeExpression = selectorExpression.calleeExpression
                if (calleeExpression is KtSimpleNameExpression) {
                    val calleeName = calleeExpression.getReferencedNameAsName()
                    return if (isCallingMethodOfAny(selectorExpression, calleeName)) {
                        resolveSupertypesForMethodOfAny(supertypes, calleeName, anyType)
                    }
                    else {
                        resolveSupertypesByCalleeName(supertypes, calleeName)
                    }
                }
            }
            is KtSimpleNameExpression -> {
                // super.x: x can be a property only
                // NB there are no properties in kotlin.Any
                return resolveSupertypesByPropertyName(supertypes, selectorExpression.getReferencedNameAsName())
            }
        }' @ [46:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'selectorExpression' @ [46:15] ==> val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveUnqualifiedSuperFromExpressionContext[LocalVariableDescriptor]

'selectorExpression' @ [49:40] ==> val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveUnqualifiedSuperFromExpressionContext[LocalVariableDescriptor]

'calleeExpression' @ [49:59] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'calleeExpression' @ [50:21] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveUnqualifiedSuperFromExpressionContext[LocalVariableDescriptor]

'calleeExpression' @ [51:38] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveUnqualifiedSuperFromExpressionContext[LocalVariableDescriptor]

'getReferencedNameAsName' @ [51:55] ==> public abstract fun getReferencedNameAsName(): Name defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[SimpleFunctionDescriptorImpl]

'if (isCallingMethodOfAny(selectorExpression, calleeName)) {
                        resolveSupertypesForMethodOfAny(supertypes, calleeName, anyType)
                    }
                    else {
                        resolveSupertypesByCalleeName(supertypes, calleeName)
                    }' @ [52:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<KotlinType>, elseBranch: Collection<KotlinType>): Collection<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<KotlinType>

'isCallingMethodOfAny' @ [52:32] ==> private fun isCallingMethodOfAny(callExpression: KtCallExpression, calleeName: Name): Boolean defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper in file unqualifiedSuper.kt[SimpleFunctionDescriptorImpl]

'selectorExpression' @ [52:53] ==> val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveUnqualifiedSuperFromExpressionContext[LocalVariableDescriptor]

'calleeName' @ [52:73] ==> val calleeName: Name defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveUnqualifiedSuperFromExpressionContext[LocalVariableDescriptor]

'resolveSupertypesForMethodOfAny' @ [53:25] ==> private fun resolveSupertypesForMethodOfAny(supertypes: Collection<KotlinType>, calleeName: Name, anyType: KotlinType): Collection<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper[SimpleFunctionDescriptorImpl]

'supertypes' @ [53:57] ==> value-parameter supertypes: Collection<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveUnqualifiedSuperFromExpressionContext[ValueParameterDescriptorImpl]

'calleeName' @ [53:69] ==> val calleeName: Name defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveUnqualifiedSuperFromExpressionContext[LocalVariableDescriptor]

'anyType' @ [53:81] ==> value-parameter anyType: KotlinType defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveUnqualifiedSuperFromExpressionContext[ValueParameterDescriptorImpl]

'resolveSupertypesByCalleeName' @ [56:25] ==> private fun resolveSupertypesByCalleeName(supertypes: Collection<KotlinType>, calleeName: Name): Collection<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper[SimpleFunctionDescriptorImpl]

'supertypes' @ [56:55] ==> value-parameter supertypes: Collection<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveUnqualifiedSuperFromExpressionContext[ValueParameterDescriptorImpl]

'calleeName' @ [56:67] ==> val calleeName: Name defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveUnqualifiedSuperFromExpressionContext[LocalVariableDescriptor]

'resolveSupertypesByPropertyName' @ [63:24] ==> private fun resolveSupertypesByPropertyName(supertypes: Collection<KotlinType>, propertyName: Name): Collection<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper[SimpleFunctionDescriptorImpl]

'supertypes' @ [63:56] ==> value-parameter supertypes: Collection<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveUnqualifiedSuperFromExpressionContext[ValueParameterDescriptorImpl]

'selectorExpression' @ [63:68] ==> val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveUnqualifiedSuperFromExpressionContext[LocalVariableDescriptor]

'getReferencedNameAsName' @ [63:87] ==> public abstract fun getReferencedNameAsName(): Name defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[SimpleFunctionDescriptorImpl]

'emptyList' @ [68:12] ==> public fun <T> emptyList(): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'hashMapOf' @ [71:39] ==> public fun <K, V> hashMapOf(vararg pairs: Pair<String, Int>): HashMap<String, Int> /* = HashMap<String, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'to' @ [71:49] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [71:66] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [71:81] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'ARITY_OF_METHODS_OF_ANY' @ [74:9] ==> private val ARITY_OF_METHODS_OF_ANY: HashMap<String, Int> /* = HashMap<String, Int> */ defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper in file unqualifiedSuper.kt[PropertyDescriptorImpl]

'getOrElse' @ [74:33] ==> @InlineOnly public inline fun <K, V> Map<String, Int>.getOrElse(key: String, defaultValue: () -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'calleeName' @ [74:43] ==> value-parameter calleeName: Name defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.isCallingMethodOfAny[ValueParameterDescriptorImpl]

'asString' @ [74:54] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'-' @ [74:68] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'callExpression' @ [74:77] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.isCallingMethodOfAny[ValueParameterDescriptorImpl]

'valueArguments' @ [74:92] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'size' @ [74:107] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'supertypes' @ [77:9] ==> value-parameter supertypes: Collection<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.isPossiblyAmbiguousUnqualifiedSuper[ValueParameterDescriptorImpl]

'size' @ [77:20] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'supertypes' @ [78:10] ==> value-parameter supertypes: Collection<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.isPossiblyAmbiguousUnqualifiedSuper[ValueParameterDescriptorImpl]

'size' @ [78:21] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'supertypes' @ [78:34] ==> value-parameter supertypes: Collection<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.isPossiblyAmbiguousUnqualifiedSuper[ValueParameterDescriptorImpl]

'single' @ [78:45] ==> public fun <T> Iterable<KotlinType>.single(): KotlinType defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'isInterface' @ [78:54] ==> private fun KotlinType.isInterface(): Boolean defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper in file unqualifiedSuper.kt[SimpleFunctionDescriptorImpl]

'isCallingMethodOfAnyWithSuper' @ [78:71] ==> private fun isCallingMethodOfAnyWithSuper(superExpression: KtSuperExpression): Boolean defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper in file unqualifiedSuper.kt[SimpleFunctionDescriptorImpl]

'superExpression' @ [78:101] ==> value-parameter superExpression: KtSuperExpression defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.isPossiblyAmbiguousUnqualifiedSuper[ValueParameterDescriptorImpl]

'superExpression' @ [81:18] ==> value-parameter superExpression: KtSuperExpression defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.isCallingMethodOfAnyWithSuper[ValueParameterDescriptorImpl]

'parent' @ [81:34] ==> public final val KtSuperExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [82:9] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.isCallingMethodOfAnyWithSuper[LocalVariableDescriptor]

'parent' @ [83:34] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.isCallingMethodOfAnyWithSuper[LocalVariableDescriptor]

'selectorExpression' @ [83:41] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[PropertyDescriptorImpl]

'selectorExpression' @ [84:13] ==> val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.isCallingMethodOfAnyWithSuper[LocalVariableDescriptor]

'selectorExpression' @ [85:36] ==> val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.isCallingMethodOfAnyWithSuper[LocalVariableDescriptor]

'calleeExpression' @ [85:55] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'calleeExpression' @ [86:17] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.isCallingMethodOfAnyWithSuper[LocalVariableDescriptor]

'calleeExpression' @ [87:34] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.isCallingMethodOfAnyWithSuper[LocalVariableDescriptor]

'getReferencedNameAsName' @ [87:51] ==> public abstract fun getReferencedNameAsName(): Name defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[SimpleFunctionDescriptorImpl]

'isCallingMethodOfAny' @ [88:24] ==> private fun isCallingMethodOfAny(callExpression: KtCallExpression, calleeName: Name): Boolean defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper in file unqualifiedSuper.kt[SimpleFunctionDescriptorImpl]

'selectorExpression' @ [88:45] ==> val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.isCallingMethodOfAnyWithSuper[LocalVariableDescriptor]

'calleeName' @ [88:65] ==> val calleeName: Name defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.isCallingMethodOfAnyWithSuper[LocalVariableDescriptor]

'WHEN_GET_SUPER_MEMBERS' @ [96:48] ==> enum entry WHEN_GET_SUPER_MEMBERS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'==' @ [99:9] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.ClassKind[DeserializedSimpleFunctionDescriptor]

'getClassDescriptor' @ [99:19] ==> @Nullable public open fun getClassDescriptor(@NotNull p0: KotlinType): ClassDescriptor? defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'this' @ [99:38] ==> <this> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.isInterface[ReceiverParameterDescriptorImpl]

'kind' @ [99:45] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [99:63] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'resolveSupertypesByMembers' @ [102:37] ==> private inline fun resolveSupertypesByMembers(supertypes: Collection<KotlinType>, allowNonConcreteMembers: Boolean, getMembers: (KotlinType) -> Collection<MemberDescriptor>): Collection<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper[SimpleFunctionDescriptorImpl]

'supertypes' @ [102:64] ==> value-parameter supertypes: Collection<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesForMethodOfAny[ValueParameterDescriptorImpl]

'getFunctionMembers' @ [103:9] ==> private fun getFunctionMembers(type: KotlinType, name: Name, location: LookupLocation): Collection<MemberDescriptor> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper[SimpleFunctionDescriptorImpl]

'it' @ [103:28] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesForMethodOfAny.<anonymous>[ValueParameterDescriptorImpl]

'calleeName' @ [103:32] ==> value-parameter calleeName: Name defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesForMethodOfAny[ValueParameterDescriptorImpl]

'LOOKUP_LOCATION' @ [103:44] ==> private val LOOKUP_LOCATION: NoLookupLocation defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper in file unqualifiedSuper.kt[PropertyDescriptorImpl]

'if (typesWithConcreteOverride.isNotEmpty())
        typesWithConcreteOverride
    else
        listOf(anyType)' @ [105:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<KotlinType>, elseBranch: Collection<KotlinType>): Collection<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<KotlinType>

'typesWithConcreteOverride' @ [105:16] ==> val typesWithConcreteOverride: Collection<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesForMethodOfAny[LocalVariableDescriptor]

'isNotEmpty' @ [105:42] ==> @InlineOnly public inline fun <T> Collection<KotlinType>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'typesWithConcreteOverride' @ [106:9] ==> val typesWithConcreteOverride: Collection<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesForMethodOfAny[LocalVariableDescriptor]

'listOf' @ [108:9] ==> public fun <T> listOf(element: KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'anyType' @ [108:16] ==> value-parameter anyType: KotlinType defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesForMethodOfAny[ValueParameterDescriptorImpl]

'resolveSupertypesByMembers' @ [112:9] ==> private inline fun resolveSupertypesByMembers(supertypes: Collection<KotlinType>, allowNonConcreteMembers: Boolean, getMembers: (KotlinType) -> Collection<MemberDescriptor>): Collection<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper[SimpleFunctionDescriptorImpl]

'supertypes' @ [112:36] ==> value-parameter supertypes: Collection<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByCalleeName[ValueParameterDescriptorImpl]

'getFunctionMembers' @ [113:13] ==> private fun getFunctionMembers(type: KotlinType, name: Name, location: LookupLocation): Collection<MemberDescriptor> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper[SimpleFunctionDescriptorImpl]

'it' @ [113:32] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByCalleeName.<anonymous>[ValueParameterDescriptorImpl]

'calleeName' @ [113:36] ==> value-parameter calleeName: Name defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByCalleeName[ValueParameterDescriptorImpl]

'LOOKUP_LOCATION' @ [113:48] ==> private val LOOKUP_LOCATION: NoLookupLocation defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper in file unqualifiedSuper.kt[PropertyDescriptorImpl]

'getPropertyMembers' @ [114:13] ==> private fun getPropertyMembers(type: KotlinType, name: Name, location: LookupLocation): Collection<MemberDescriptor> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper[SimpleFunctionDescriptorImpl]

'it' @ [114:32] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByCalleeName.<anonymous>[ValueParameterDescriptorImpl]

'calleeName' @ [114:36] ==> value-parameter calleeName: Name defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByCalleeName[ValueParameterDescriptorImpl]

'LOOKUP_LOCATION' @ [114:48] ==> private val LOOKUP_LOCATION: NoLookupLocation defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper in file unqualifiedSuper.kt[PropertyDescriptorImpl]

'resolveSupertypesByMembers' @ [118:9] ==> private inline fun resolveSupertypesByMembers(supertypes: Collection<KotlinType>, allowNonConcreteMembers: Boolean, getMembers: (KotlinType) -> Collection<MemberDescriptor>): Collection<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper[SimpleFunctionDescriptorImpl]

'supertypes' @ [118:36] ==> value-parameter supertypes: Collection<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByPropertyName[ValueParameterDescriptorImpl]

'getPropertyMembers' @ [119:13] ==> private fun getPropertyMembers(type: KotlinType, name: Name, location: LookupLocation): Collection<MemberDescriptor> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper[SimpleFunctionDescriptorImpl]

'it' @ [119:32] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByPropertyName.<anonymous>[ValueParameterDescriptorImpl]

'propertyName' @ [119:36] ==> value-parameter propertyName: Name defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByPropertyName[ValueParameterDescriptorImpl]

'LOOKUP_LOCATION' @ [119:50] ==> private val LOOKUP_LOCATION: NoLookupLocation defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper in file unqualifiedSuper.kt[PropertyDescriptorImpl]

'SmartList' @ [127:36] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinType

'SmartList' @ [128:39] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinType

'supertypes' @ [130:23] ==> value-parameter supertypes: Collection<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByMembers[ValueParameterDescriptorImpl]

'invoke' @ [131:23] ==> public abstract operator fun invoke(p1: KotlinType): Collection<MemberDescriptor> defined in kotlin.Function1[FunctionInvokeDescriptor]

'supertype' @ [131:34] ==> val supertype: KotlinType defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByMembers[LocalVariableDescriptor]

'members' @ [132:13] ==> val members: Collection<MemberDescriptor> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByMembers[LocalVariableDescriptor]

'isNotEmpty' @ [132:21] ==> @InlineOnly public inline fun <T> Collection<MemberDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberDescriptor

'if (members.any { isConcreteMember(supertype, it) })
                typesWithConcreteMembers.add(supertype)
            else
                typesWithNonConcreteMembers.add(supertype)' @ [133:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'members' @ [133:17] ==> val members: Collection<MemberDescriptor> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByMembers[LocalVariableDescriptor]

'any' @ [133:25] ==> public inline fun <T> Iterable<MemberDescriptor>.any(predicate: (MemberDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberDescriptor

'isConcreteMember' @ [133:31] ==> private fun isConcreteMember(supertype: KotlinType, memberDescriptor: MemberDescriptor): Boolean defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper in file unqualifiedSuper.kt[SimpleFunctionDescriptorImpl]

'supertype' @ [133:48] ==> val supertype: KotlinType defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByMembers[LocalVariableDescriptor]

'it' @ [133:59] ==> value-parameter it: MemberDescriptor defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByMembers.<anonymous>[ValueParameterDescriptorImpl]

'typesWithConcreteMembers' @ [134:17] ==> val typesWithConcreteMembers: SmartList<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByMembers[LocalVariableDescriptor]

'add' @ [134:42] ==> public open fun add(element: (KotlinType..KotlinType?)): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'supertype' @ [134:46] ==> val supertype: KotlinType defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByMembers[LocalVariableDescriptor]

'typesWithNonConcreteMembers' @ [136:17] ==> val typesWithNonConcreteMembers: SmartList<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByMembers[LocalVariableDescriptor]

'add' @ [136:45] ==> public open fun add(element: (KotlinType..KotlinType?)): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'supertype' @ [136:49] ==> val supertype: KotlinType defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByMembers[LocalVariableDescriptor]

'typesWithConcreteMembers' @ [140:5] ==> val typesWithConcreteMembers: SmartList<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByMembers[LocalVariableDescriptor]

'removeAll' @ [140:30] ==> public fun <T> MutableList<(KotlinType..KotlinType?)>.removeAll(predicate: ((KotlinType..KotlinType?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'typesWithNonConcreteMembers' @ [141:9] ==> val typesWithNonConcreteMembers: SmartList<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByMembers[LocalVariableDescriptor]

'any' @ [141:37] ==> public inline fun <T> Iterable<(KotlinType..KotlinType?)>.any(predicate: ((KotlinType..KotlinType?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'DEFAULT' @ [142:31] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [142:39] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'typeWithNonConcreteMember' @ [142:51] ==> value-parameter typeWithNonConcreteMember: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByMembers.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'typeWithConcreteMember' @ [142:78] ==> value-parameter typeWithConcreteMember: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByMembers.<anonymous>[ValueParameterDescriptorImpl]

'when {
        typesWithConcreteMembers.isNotEmpty() ->
            typesWithConcreteMembers
        allowNonConcreteMembers ->
            typesWithNonConcreteMembers
        else ->
            emptyList()
    }' @ [146:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<KotlinType>, entry1: Collection<KotlinType>, entry2: Collection<KotlinType>): Collection<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<KotlinType>

'typesWithConcreteMembers' @ [147:9] ==> val typesWithConcreteMembers: SmartList<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByMembers[LocalVariableDescriptor]

'isNotEmpty' @ [147:34] ==> @InlineOnly public inline fun <T> Collection<(KotlinType..KotlinType?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'typesWithConcreteMembers' @ [148:13] ==> val typesWithConcreteMembers: SmartList<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByMembers[LocalVariableDescriptor]

'allowNonConcreteMembers' @ [149:9] ==> value-parameter allowNonConcreteMembers: Boolean defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByMembers[ValueParameterDescriptorImpl]

'typesWithNonConcreteMembers' @ [150:13] ==> val typesWithNonConcreteMembers: SmartList<KotlinType> defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.resolveSupertypesByMembers[LocalVariableDescriptor]

'emptyList' @ [152:13] ==> public fun <T> emptyList(): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'type' @ [157:9] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.getFunctionMembers[ValueParameterDescriptorImpl]

'memberScope' @ [157:14] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getContributedFunctions' @ [157:26] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [157:50] ==> value-parameter name: Name defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.getFunctionMembers[ValueParameterDescriptorImpl]

'location' @ [157:56] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.getFunctionMembers[ValueParameterDescriptorImpl]

'type' @ [160:9] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.getPropertyMembers[ValueParameterDescriptorImpl]

'memberScope' @ [160:14] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getContributedVariables' @ [160:26] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [160:50] ==> value-parameter name: Name defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.getPropertyMembers[ValueParameterDescriptorImpl]

'location' @ [160:56] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.getPropertyMembers[ValueParameterDescriptorImpl]

'filterIsInstanceTo' @ [160:66] ==> public inline fun <reified R, C : MutableCollection<in MemberDescriptor>> Iterable<*>.filterIsInstanceTo(destination: SmartList<MemberDescriptor>): SmartList<MemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> MemberDescriptor
    <C : MutableCollection<in R>> -> SmartList<MemberDescriptor>

'SmartList' @ [160:85] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> MemberDescriptor

'memberDescriptor' @ [166:9] ==> value-parameter memberDescriptor: MemberDescriptor defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.isConcreteMember[ValueParameterDescriptorImpl]

'modality' @ [166:26] ==> public final val MemberDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [166:38] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [166:47] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'getClassDescriptor' @ [169:49] ==> @Nullable public open fun getClassDescriptor(@NotNull p0: KotlinType): ClassDescriptor? defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'supertype' @ [169:68] ==> value-parameter supertype: KotlinType defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.isConcreteMember[ValueParameterDescriptorImpl]

'memberDescriptor' @ [170:23] ==> value-parameter memberDescriptor: MemberDescriptor defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.isConcreteMember[ValueParameterDescriptorImpl]

'kind' @ [170:69] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'classDescriptorForSupertype' @ [171:9] ==> val classDescriptorForSupertype: ClassDescriptor? defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.isConcreteMember[LocalVariableDescriptor]

'kind' @ [171:38] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [171:56] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'memberKind' @ [171:69] ==> val memberKind: CallableMemberDescriptor.Kind defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.isConcreteMember[LocalVariableDescriptor]

'FAKE_OVERRIDE' @ [171:113] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'memberDescriptor' @ [173:36] ==> value-parameter memberDescriptor: MemberDescriptor defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.isConcreteMember[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [173:53] ==> public final val CallableMemberDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [173:80] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'?:' @ [174:37] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ClassDescriptor?, right: ClassDescriptor): ClassDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ClassDescriptor

'getClassDescriptor' @ [174:47] ==> @Nullable public open fun getClassDescriptor(@NotNull p0: KotlinType): ClassDescriptor? defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'dispatchReceiverType' @ [174:66] ==> val dispatchReceiverType: KotlinType defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.isConcreteMember[LocalVariableDescriptor]

'!' @ [175:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAny' @ [175:32] ==> public open fun isAny(@NotNull p0: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'dispatchReceiverClass' @ [175:38] ==> val dispatchReceiverClass: ClassDescriptor defined in org.jetbrains.kotlin.types.expressions.unqualifiedSuper.isConcreteMember[LocalVariableDescriptor]

