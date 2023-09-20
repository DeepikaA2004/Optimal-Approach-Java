def is_anagram(a, b):
	# Sort the strings
	sorted_a = sorted(a)
	sorted_b = sorted(b)

	# Compare the sorted strings
	if sorted_a == sorted_b:
		return True
	else:
		return False


if __name__ == "__main__":
	a = "kpriet"
	b = "teirpk"

	if is_anagram(a, b):
		print("YES, They are Anagram")
	else:
		print("NO, They are not Anagram")
