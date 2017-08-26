'StringBuilder' @ [20:19] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'this' @ [22:15] ==> <this> defined in org.jetbrains.kotlin.idea.util.string.collapseSpaces[ReceiverParameterDescriptorImpl]

'if (c.isWhitespace()) {
            haveSpaces = true
        }
        else {
            if (haveSpaces) {
                builder.append(" ")
                haveSpaces = false
            }
            builder.append(c)
        }' @ [23:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'c' @ [23:13] ==> val c: Char defined in org.jetbrains.kotlin.idea.util.string.collapseSpaces[LocalVariableDescriptor]

'isWhitespace' @ [23:15] ==> public fun Char.isWhitespace(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'haveSpaces' @ [24:13] ==> var haveSpaces: Boolean defined in org.jetbrains.kotlin.idea.util.string.collapseSpaces[LocalVariableDescriptor]

'haveSpaces' @ [27:17] ==> var haveSpaces: Boolean defined in org.jetbrains.kotlin.idea.util.string.collapseSpaces[LocalVariableDescriptor]

'builder' @ [28:17] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.util.string.collapseSpaces[LocalVariableDescriptor]

'append' @ [28:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'haveSpaces' @ [29:17] ==> var haveSpaces: Boolean defined in org.jetbrains.kotlin.idea.util.string.collapseSpaces[LocalVariableDescriptor]

'builder' @ [31:13] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.util.string.collapseSpaces[LocalVariableDescriptor]

'append' @ [31:21] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'c' @ [31:28] ==> val c: Char defined in org.jetbrains.kotlin.idea.util.string.collapseSpaces[LocalVariableDescriptor]

'builder' @ [34:12] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.util.string.collapseSpaces[LocalVariableDescriptor]

'toString' @ [34:20] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

