'getUsageType' @ [27:67] ==> public open fun getUsageType(element: PsiElement?, targets: Array<out UsageTarget>): UsageType? defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypeProvider[SimpleFunctionDescriptorImpl]

'element' @ [27:80] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypeProvider.getUsageType[ValueParameterDescriptorImpl]

'EMPTY_ARRAY' @ [27:101] ==> public final val EMPTY_ARRAY: (Array<(UsageTarget..UsageTarget?)>..Array<out (UsageTarget..UsageTarget?)>?) defined in com.intellij.usages.UsageTarget[JavaPropertyDescriptor]

'UsageTypeUtils' @ [30:25] ==> public object UsageTypeUtils defined in org.jetbrains.kotlin.idea.findUsages[FakeCallableDescriptorForObject]

'getUsageType' @ [30:40] ==> public final fun getUsageType(element: PsiElement?): UsageTypeEnum? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils[DeserializedSimpleFunctionDescriptor]

'element' @ [30:53] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypeProvider.getUsageType[ValueParameterDescriptorImpl]

'convertEnumToUsageType' @ [31:16] ==> public final fun convertEnumToUsageType(usageType: UsageTypeEnum): UsageType defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypeProvider[SimpleFunctionDescriptorImpl]

'usageType' @ [31:39] ==> val usageType: UsageTypeEnum defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypeProvider.getUsageType[LocalVariableDescriptor]

'when (usageType) {
        TYPE_CONSTRAINT -> KotlinUsageTypes.TYPE_CONSTRAINT
        VALUE_PARAMETER_TYPE -> KotlinUsageTypes.VALUE_PARAMETER_TYPE
        NON_LOCAL_PROPERTY_TYPE -> KotlinUsageTypes.NON_LOCAL_PROPERTY_TYPE
        FUNCTION_RETURN_TYPE -> KotlinUsageTypes.FUNCTION_RETURN_TYPE
        SUPER_TYPE -> KotlinUsageTypes.SUPER_TYPE
        IS -> KotlinUsageTypes.IS
        CLASS_OBJECT_ACCESS -> KotlinUsageTypes.CLASS_OBJECT_ACCESS
        COMPANION_OBJECT_ACCESS -> KotlinUsageTypes.COMPANION_OBJECT_ACCESS
        EXTENSION_RECEIVER_TYPE -> KotlinUsageTypes.EXTENSION_RECEIVER_TYPE
        SUPER_TYPE_QUALIFIER -> KotlinUsageTypes.SUPER_TYPE_QUALIFIER
        TYPE_ALIAS -> KotlinUsageTypes.TYPE_ALIAS

        FUNCTION_CALL -> KotlinUsageTypes.FUNCTION_CALL
        IMPLICIT_GET -> KotlinUsageTypes.IMPLICIT_GET
        IMPLICIT_SET -> KotlinUsageTypes.IMPLICIT_SET
        IMPLICIT_INVOKE -> KotlinUsageTypes.IMPLICIT_INVOKE
        IMPLICIT_ITERATION -> KotlinUsageTypes.IMPLICIT_ITERATION
        PROPERTY_DELEGATION -> KotlinUsageTypes.PROPERTY_DELEGATION

        RECEIVER -> KotlinUsageTypes.RECEIVER
        DELEGATE -> KotlinUsageTypes.DELEGATE

        PACKAGE_DIRECTIVE -> KotlinUsageTypes.PACKAGE_DIRECTIVE
        PACKAGE_MEMBER_ACCESS -> KotlinUsageTypes.PACKAGE_MEMBER_ACCESS

        CALLABLE_REFERENCE -> KotlinUsageTypes.CALLABLE_REFERENCE

        READ -> UsageType.READ
        WRITE -> UsageType.WRITE
        CLASS_IMPORT -> UsageType.CLASS_IMPORT
        CLASS_LOCAL_VAR_DECLARATION -> UsageType.CLASS_LOCAL_VAR_DECLARATION
        TYPE_PARAMETER -> UsageType.TYPE_PARAMETER
        CLASS_CAST_TO -> UsageType.CLASS_CAST_TO
        ANNOTATION -> UsageType.ANNOTATION
        CLASS_NEW_OPERATOR -> UsageType.CLASS_NEW_OPERATOR
        NAMED_ARGUMENT -> KotlinUsageTypes.NAMED_ARGUMENT

        USAGE_IN_STRING_LITERAL -> UsageType.LITERAL_USAGE
    }' @ [34:71] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UsageType, entry1: UsageType, entry2: UsageType, entry3: UsageType, entry4: UsageType, entry5: UsageType, entry6: UsageType, entry7: UsageType, entry8: UsageType, entry9: UsageType, entry10: UsageType, entry11: UsageType, entry12: UsageType, entry13: UsageType, entry14: UsageType, entry15: UsageType, entry16: UsageType, entry17: UsageType, entry18: UsageType, entry19: UsageType, entry20: UsageType, entry21: UsageType, entry22: UsageType, entry23: UsageType, entry24: UsageType, entry25: UsageType, entry26: UsageType, entry27: UsageType, entry28: UsageType, entry29: UsageType, entry30: UsageType, entry31: UsageType): UsageType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UsageType

'usageType' @ [34:77] ==> value-parameter usageType: UsageTypeEnum defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypeProvider.convertEnumToUsageType[ValueParameterDescriptorImpl]

'TYPE_CONSTRAINT' @ [35:9] ==> enum entry TYPE_CONSTRAINT defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'KotlinUsageTypes' @ [35:28] ==> public object KotlinUsageTypes defined in org.jetbrains.kotlin.idea.findUsages in file KotlinUsageTypeProvider.kt[FakeCallableDescriptorForObject]

'TYPE_CONSTRAINT' @ [35:45] ==> public final val TYPE_CONSTRAINT: UsageType defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypes[PropertyDescriptorImpl]

'VALUE_PARAMETER_TYPE' @ [36:9] ==> enum entry VALUE_PARAMETER_TYPE defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'KotlinUsageTypes' @ [36:33] ==> public object KotlinUsageTypes defined in org.jetbrains.kotlin.idea.findUsages in file KotlinUsageTypeProvider.kt[FakeCallableDescriptorForObject]

'VALUE_PARAMETER_TYPE' @ [36:50] ==> public final val VALUE_PARAMETER_TYPE: UsageType defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypes[PropertyDescriptorImpl]

'NON_LOCAL_PROPERTY_TYPE' @ [37:9] ==> enum entry NON_LOCAL_PROPERTY_TYPE defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'KotlinUsageTypes' @ [37:36] ==> public object KotlinUsageTypes defined in org.jetbrains.kotlin.idea.findUsages in file KotlinUsageTypeProvider.kt[FakeCallableDescriptorForObject]

'NON_LOCAL_PROPERTY_TYPE' @ [37:53] ==> public final val NON_LOCAL_PROPERTY_TYPE: UsageType defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypes[PropertyDescriptorImpl]

'FUNCTION_RETURN_TYPE' @ [38:9] ==> enum entry FUNCTION_RETURN_TYPE defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'KotlinUsageTypes' @ [38:33] ==> public object KotlinUsageTypes defined in org.jetbrains.kotlin.idea.findUsages in file KotlinUsageTypeProvider.kt[FakeCallableDescriptorForObject]

'FUNCTION_RETURN_TYPE' @ [38:50] ==> public final val FUNCTION_RETURN_TYPE: UsageType defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypes[PropertyDescriptorImpl]

'SUPER_TYPE' @ [39:9] ==> enum entry SUPER_TYPE defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'KotlinUsageTypes' @ [39:23] ==> public object KotlinUsageTypes defined in org.jetbrains.kotlin.idea.findUsages in file KotlinUsageTypeProvider.kt[FakeCallableDescriptorForObject]

'SUPER_TYPE' @ [39:40] ==> public final val SUPER_TYPE: UsageType defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypes[PropertyDescriptorImpl]

'IS' @ [40:9] ==> enum entry IS defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'KotlinUsageTypes' @ [40:15] ==> public object KotlinUsageTypes defined in org.jetbrains.kotlin.idea.findUsages in file KotlinUsageTypeProvider.kt[FakeCallableDescriptorForObject]

'IS' @ [40:32] ==> public final val IS: UsageType defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypes[PropertyDescriptorImpl]

'CLASS_OBJECT_ACCESS' @ [41:9] ==> enum entry CLASS_OBJECT_ACCESS defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'KotlinUsageTypes' @ [41:32] ==> public object KotlinUsageTypes defined in org.jetbrains.kotlin.idea.findUsages in file KotlinUsageTypeProvider.kt[FakeCallableDescriptorForObject]

'CLASS_OBJECT_ACCESS' @ [41:49] ==> public final val CLASS_OBJECT_ACCESS: UsageType defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypes[PropertyDescriptorImpl]

'COMPANION_OBJECT_ACCESS' @ [42:9] ==> enum entry COMPANION_OBJECT_ACCESS defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'KotlinUsageTypes' @ [42:36] ==> public object KotlinUsageTypes defined in org.jetbrains.kotlin.idea.findUsages in file KotlinUsageTypeProvider.kt[FakeCallableDescriptorForObject]

'COMPANION_OBJECT_ACCESS' @ [42:53] ==> public final val COMPANION_OBJECT_ACCESS: UsageType defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypes[PropertyDescriptorImpl]

'EXTENSION_RECEIVER_TYPE' @ [43:9] ==> enum entry EXTENSION_RECEIVER_TYPE defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'KotlinUsageTypes' @ [43:36] ==> public object KotlinUsageTypes defined in org.jetbrains.kotlin.idea.findUsages in file KotlinUsageTypeProvider.kt[FakeCallableDescriptorForObject]

'EXTENSION_RECEIVER_TYPE' @ [43:53] ==> public final val EXTENSION_RECEIVER_TYPE: UsageType defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypes[PropertyDescriptorImpl]

'SUPER_TYPE_QUALIFIER' @ [44:9] ==> enum entry SUPER_TYPE_QUALIFIER defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'KotlinUsageTypes' @ [44:33] ==> public object KotlinUsageTypes defined in org.jetbrains.kotlin.idea.findUsages in file KotlinUsageTypeProvider.kt[FakeCallableDescriptorForObject]

'SUPER_TYPE_QUALIFIER' @ [44:50] ==> public final val SUPER_TYPE_QUALIFIER: UsageType defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypes[PropertyDescriptorImpl]

'TYPE_ALIAS' @ [45:9] ==> enum entry TYPE_ALIAS defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'KotlinUsageTypes' @ [45:23] ==> public object KotlinUsageTypes defined in org.jetbrains.kotlin.idea.findUsages in file KotlinUsageTypeProvider.kt[FakeCallableDescriptorForObject]

'TYPE_ALIAS' @ [45:40] ==> public final val TYPE_ALIAS: UsageType defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypes[PropertyDescriptorImpl]

'FUNCTION_CALL' @ [47:9] ==> enum entry FUNCTION_CALL defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'KotlinUsageTypes' @ [47:26] ==> public object KotlinUsageTypes defined in org.jetbrains.kotlin.idea.findUsages in file KotlinUsageTypeProvider.kt[FakeCallableDescriptorForObject]

'FUNCTION_CALL' @ [47:43] ==> public final val FUNCTION_CALL: UsageType defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypes[PropertyDescriptorImpl]

'IMPLICIT_GET' @ [48:9] ==> enum entry IMPLICIT_GET defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'KotlinUsageTypes' @ [48:25] ==> public object KotlinUsageTypes defined in org.jetbrains.kotlin.idea.findUsages in file KotlinUsageTypeProvider.kt[FakeCallableDescriptorForObject]

'IMPLICIT_GET' @ [48:42] ==> public final val IMPLICIT_GET: UsageType defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypes[PropertyDescriptorImpl]

'IMPLICIT_SET' @ [49:9] ==> enum entry IMPLICIT_SET defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'KotlinUsageTypes' @ [49:25] ==> public object KotlinUsageTypes defined in org.jetbrains.kotlin.idea.findUsages in file KotlinUsageTypeProvider.kt[FakeCallableDescriptorForObject]

'IMPLICIT_SET' @ [49:42] ==> public final val IMPLICIT_SET: UsageType defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypes[PropertyDescriptorImpl]

'IMPLICIT_INVOKE' @ [50:9] ==> enum entry IMPLICIT_INVOKE defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'KotlinUsageTypes' @ [50:28] ==> public object KotlinUsageTypes defined in org.jetbrains.kotlin.idea.findUsages in file KotlinUsageTypeProvider.kt[FakeCallableDescriptorForObject]

'IMPLICIT_INVOKE' @ [50:45] ==> public final val IMPLICIT_INVOKE: UsageType defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypes[PropertyDescriptorImpl]

'IMPLICIT_ITERATION' @ [51:9] ==> enum entry IMPLICIT_ITERATION defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'KotlinUsageTypes' @ [51:31] ==> public object KotlinUsageTypes defined in org.jetbrains.kotlin.idea.findUsages in file KotlinUsageTypeProvider.kt[FakeCallableDescriptorForObject]

'IMPLICIT_ITERATION' @ [51:48] ==> public final val IMPLICIT_ITERATION: UsageType defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypes[PropertyDescriptorImpl]

'PROPERTY_DELEGATION' @ [52:9] ==> enum entry PROPERTY_DELEGATION defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'KotlinUsageTypes' @ [52:32] ==> public object KotlinUsageTypes defined in org.jetbrains.kotlin.idea.findUsages in file KotlinUsageTypeProvider.kt[FakeCallableDescriptorForObject]

'PROPERTY_DELEGATION' @ [52:49] ==> public final val PROPERTY_DELEGATION: UsageType defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypes[PropertyDescriptorImpl]

'RECEIVER' @ [54:9] ==> enum entry RECEIVER defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'KotlinUsageTypes' @ [54:21] ==> public object KotlinUsageTypes defined in org.jetbrains.kotlin.idea.findUsages in file KotlinUsageTypeProvider.kt[FakeCallableDescriptorForObject]

'RECEIVER' @ [54:38] ==> public final val RECEIVER: UsageType defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypes[PropertyDescriptorImpl]

'DELEGATE' @ [55:9] ==> enum entry DELEGATE defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'KotlinUsageTypes' @ [55:21] ==> public object KotlinUsageTypes defined in org.jetbrains.kotlin.idea.findUsages in file KotlinUsageTypeProvider.kt[FakeCallableDescriptorForObject]

'DELEGATE' @ [55:38] ==> public final val DELEGATE: UsageType defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypes[PropertyDescriptorImpl]

'PACKAGE_DIRECTIVE' @ [57:9] ==> enum entry PACKAGE_DIRECTIVE defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'KotlinUsageTypes' @ [57:30] ==> public object KotlinUsageTypes defined in org.jetbrains.kotlin.idea.findUsages in file KotlinUsageTypeProvider.kt[FakeCallableDescriptorForObject]

'PACKAGE_DIRECTIVE' @ [57:47] ==> public final val PACKAGE_DIRECTIVE: UsageType defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypes[PropertyDescriptorImpl]

'PACKAGE_MEMBER_ACCESS' @ [58:9] ==> enum entry PACKAGE_MEMBER_ACCESS defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'KotlinUsageTypes' @ [58:34] ==> public object KotlinUsageTypes defined in org.jetbrains.kotlin.idea.findUsages in file KotlinUsageTypeProvider.kt[FakeCallableDescriptorForObject]

'PACKAGE_MEMBER_ACCESS' @ [58:51] ==> public final val PACKAGE_MEMBER_ACCESS: UsageType defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypes[PropertyDescriptorImpl]

'CALLABLE_REFERENCE' @ [60:9] ==> enum entry CALLABLE_REFERENCE defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'KotlinUsageTypes' @ [60:31] ==> public object KotlinUsageTypes defined in org.jetbrains.kotlin.idea.findUsages in file KotlinUsageTypeProvider.kt[FakeCallableDescriptorForObject]

'CALLABLE_REFERENCE' @ [60:48] ==> public final val CALLABLE_REFERENCE: UsageType defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypes[PropertyDescriptorImpl]

'READ' @ [62:9] ==> enum entry READ defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'READ' @ [62:27] ==> public final val READ: (UsageType..UsageType?) defined in com.intellij.usages.impl.rules.UsageType[JavaPropertyDescriptor]

'WRITE' @ [63:9] ==> enum entry WRITE defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'WRITE' @ [63:28] ==> public final val WRITE: (UsageType..UsageType?) defined in com.intellij.usages.impl.rules.UsageType[JavaPropertyDescriptor]

'CLASS_IMPORT' @ [64:9] ==> enum entry CLASS_IMPORT defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'CLASS_IMPORT' @ [64:35] ==> public final val CLASS_IMPORT: (UsageType..UsageType?) defined in com.intellij.usages.impl.rules.UsageType[JavaPropertyDescriptor]

'CLASS_LOCAL_VAR_DECLARATION' @ [65:9] ==> enum entry CLASS_LOCAL_VAR_DECLARATION defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'CLASS_LOCAL_VAR_DECLARATION' @ [65:50] ==> public final val CLASS_LOCAL_VAR_DECLARATION: (UsageType..UsageType?) defined in com.intellij.usages.impl.rules.UsageType[JavaPropertyDescriptor]

'TYPE_PARAMETER' @ [66:9] ==> enum entry TYPE_PARAMETER defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'TYPE_PARAMETER' @ [66:37] ==> public final val TYPE_PARAMETER: (UsageType..UsageType?) defined in com.intellij.usages.impl.rules.UsageType[JavaPropertyDescriptor]

'CLASS_CAST_TO' @ [67:9] ==> enum entry CLASS_CAST_TO defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'CLASS_CAST_TO' @ [67:36] ==> public final val CLASS_CAST_TO: (UsageType..UsageType?) defined in com.intellij.usages.impl.rules.UsageType[JavaPropertyDescriptor]

'ANNOTATION' @ [68:9] ==> enum entry ANNOTATION defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'ANNOTATION' @ [68:33] ==> public final val ANNOTATION: (UsageType..UsageType?) defined in com.intellij.usages.impl.rules.UsageType[JavaPropertyDescriptor]

'CLASS_NEW_OPERATOR' @ [69:9] ==> enum entry CLASS_NEW_OPERATOR defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'CLASS_NEW_OPERATOR' @ [69:41] ==> public final val CLASS_NEW_OPERATOR: (UsageType..UsageType?) defined in com.intellij.usages.impl.rules.UsageType[JavaPropertyDescriptor]

'NAMED_ARGUMENT' @ [70:9] ==> enum entry NAMED_ARGUMENT defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'KotlinUsageTypes' @ [70:27] ==> public object KotlinUsageTypes defined in org.jetbrains.kotlin.idea.findUsages in file KotlinUsageTypeProvider.kt[FakeCallableDescriptorForObject]

'NAMED_ARGUMENT' @ [70:44] ==> public final val NAMED_ARGUMENT: UsageType defined in org.jetbrains.kotlin.idea.findUsages.KotlinUsageTypes[PropertyDescriptorImpl]

'USAGE_IN_STRING_LITERAL' @ [72:9] ==> enum entry USAGE_IN_STRING_LITERAL defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'LITERAL_USAGE' @ [72:46] ==> public final val LITERAL_USAGE: (UsageType..UsageType?) defined in com.intellij.usages.impl.rules.UsageType[JavaPropertyDescriptor]

'UsageType' @ [78:27] ==> public constructor UsageType(@NotNull p0: String) defined in com.intellij.usages.impl.rules.UsageType[JavaClassConstructorDescriptor]

'message' @ [78:50] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'UsageType' @ [79:32] ==> public constructor UsageType(@NotNull p0: String) defined in com.intellij.usages.impl.rules.UsageType[JavaClassConstructorDescriptor]

'message' @ [79:55] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'UsageType' @ [80:35] ==> public constructor UsageType(@NotNull p0: String) defined in com.intellij.usages.impl.rules.UsageType[JavaClassConstructorDescriptor]

'message' @ [80:58] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'UsageType' @ [81:32] ==> public constructor UsageType(@NotNull p0: String) defined in com.intellij.usages.impl.rules.UsageType[JavaClassConstructorDescriptor]

'message' @ [81:55] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'UsageType' @ [82:22] ==> public constructor UsageType(@NotNull p0: String) defined in com.intellij.usages.impl.rules.UsageType[JavaClassConstructorDescriptor]

'message' @ [82:45] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'UsageType' @ [83:14] ==> public constructor UsageType(@NotNull p0: String) defined in com.intellij.usages.impl.rules.UsageType[JavaClassConstructorDescriptor]

'message' @ [83:37] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'UsageType' @ [84:31] ==> public constructor UsageType(@NotNull p0: String) defined in com.intellij.usages.impl.rules.UsageType[JavaClassConstructorDescriptor]

'message' @ [84:54] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'UsageType' @ [85:35] ==> public constructor UsageType(@NotNull p0: String) defined in com.intellij.usages.impl.rules.UsageType[JavaClassConstructorDescriptor]

'message' @ [85:58] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'UsageType' @ [86:35] ==> public constructor UsageType(@NotNull p0: String) defined in com.intellij.usages.impl.rules.UsageType[JavaClassConstructorDescriptor]

'message' @ [86:58] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'UsageType' @ [87:32] ==> public constructor UsageType(@NotNull p0: String) defined in com.intellij.usages.impl.rules.UsageType[JavaClassConstructorDescriptor]

'message' @ [87:55] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'UsageType' @ [88:22] ==> public constructor UsageType(@NotNull p0: String) defined in com.intellij.usages.impl.rules.UsageType[JavaClassConstructorDescriptor]

'UsageType' @ [91:25] ==> public constructor UsageType(@NotNull p0: String) defined in com.intellij.usages.impl.rules.UsageType[JavaClassConstructorDescriptor]

'message' @ [91:48] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'UsageType' @ [92:24] ==> public constructor UsageType(@NotNull p0: String) defined in com.intellij.usages.impl.rules.UsageType[JavaClassConstructorDescriptor]

'message' @ [92:47] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'UsageType' @ [93:24] ==> public constructor UsageType(@NotNull p0: String) defined in com.intellij.usages.impl.rules.UsageType[JavaClassConstructorDescriptor]

'message' @ [93:47] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'UsageType' @ [94:27] ==> public constructor UsageType(@NotNull p0: String) defined in com.intellij.usages.impl.rules.UsageType[JavaClassConstructorDescriptor]

'message' @ [94:50] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'UsageType' @ [95:30] ==> public constructor UsageType(@NotNull p0: String) defined in com.intellij.usages.impl.rules.UsageType[JavaClassConstructorDescriptor]

'message' @ [95:53] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'UsageType' @ [96:31] ==> public constructor UsageType(@NotNull p0: String) defined in com.intellij.usages.impl.rules.UsageType[JavaClassConstructorDescriptor]

'message' @ [96:54] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'UsageType' @ [99:20] ==> public constructor UsageType(@NotNull p0: String) defined in com.intellij.usages.impl.rules.UsageType[JavaClassConstructorDescriptor]

'message' @ [99:43] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'UsageType' @ [100:20] ==> public constructor UsageType(@NotNull p0: String) defined in com.intellij.usages.impl.rules.UsageType[JavaClassConstructorDescriptor]

'message' @ [100:43] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'UsageType' @ [103:29] ==> public constructor UsageType(@NotNull p0: String) defined in com.intellij.usages.impl.rules.UsageType[JavaClassConstructorDescriptor]

'message' @ [103:52] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'UsageType' @ [104:33] ==> public constructor UsageType(@NotNull p0: String) defined in com.intellij.usages.impl.rules.UsageType[JavaClassConstructorDescriptor]

'message' @ [104:56] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'UsageType' @ [107:30] ==> public constructor UsageType(@NotNull p0: String) defined in com.intellij.usages.impl.rules.UsageType[JavaClassConstructorDescriptor]

'message' @ [107:53] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'UsageType' @ [108:26] ==> public constructor UsageType(@NotNull p0: String) defined in com.intellij.usages.impl.rules.UsageType[JavaClassConstructorDescriptor]

